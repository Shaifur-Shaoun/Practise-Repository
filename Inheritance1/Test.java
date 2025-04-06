package Inheritance1;

public class Test {
    public static void main(String[] args) {
        
        Circle c1=new Circle();
        Circle c2=new Circle(3.0);
        Circle c3=new Circle(3.0, "Blue");
        
        System.out.println(c1.getArea());
        
        Cylinder cl1=new Cylinder();
        Cylinder cl2=new Cylinder(5.0);
        Cylinder cl3=new Cylinder(7.0,2.0);
        Cylinder cl4=new Cylinder(10.0,4.0,"Green");
        
        
        System.out.println(cl4.getVolume());
        
        
    }
}
