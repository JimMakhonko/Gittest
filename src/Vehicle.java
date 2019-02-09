
public class Vehicle {
    private String color;

    Vehicle(){
    this.setColor("Red");
    }
    Vehicle(String c){
        this.setColor(c);
    }
    //setter
    public void setColor(String c) {
        this.color = c;
    }
    //getter
    public String getColor(){
        return color;
    }
}
public class Program{
    public static void main(String[] args) {
        //color will be red
        Vehicle v1 = new Vehicle();

        //color will be green
        Vehicle v2 = new Vehicle("Green");
 System.out.print(v2.getColor());

    }
}