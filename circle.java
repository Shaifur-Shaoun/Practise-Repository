import java.util.*;

public class circle {
    private double radius, area;
    private String color;
    public static int count;

    public circle(){
        // radius=1.0;
        // color="red";
        // count++;
        this(1);//Constructor Chaining
    }
    public circle(double r){
        // radius=r;
        // color="red";
        // count++;
        this(r,"Red");//Constructor Chaining
        }   
    public circle(double r,String c){
       radius=r;
       color=c;

        count++;
        
        
    }
    public circle(circle another){
        this.radius=another.radius;
        this.color=another.color;
        count++;

    }
    public static int getCount(){
        return count;
    }
    
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    
    public static void main(String[] args) {
        
        circle c3=new circle();
        
        System.out.println(c3.getRadius());
        System.out.println(c3.getColor());
        System.out.println(c3.getArea());
        
        circle c2=new circle(2.0);
        
        System.out.println(c2.getRadius());
        System.out.println(c2.getColor());
        System.out.println(c2.getArea());
        
        circle c1=new circle(2.0,"blue");

        circle c5=new circle();
        
        System.out.println(c1.getRadius());
        System.out.println(c1.getColor());
        System.out.println(c1.getArea());

        System.out.println("Value of Count : " + circle.count);
        
        System.out.println("Method to Static : " + c1.getCount());
    }
}



