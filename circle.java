import java.util.*;

public class circle {
    private double radius, area;
    private String color;

    public circle(){
        radius=1.0;
        color="red";
    }
    public circle(double r){
        radius=r;
        color="red";
        }   
    public circle(double r,String c){
        radius=r;
        color=c;
        
        
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
        
        System.out.println(c1.getRadius());
        System.out.println(c1.getColor());
        System.out.println(c1.getArea());
        
        
    }
}



