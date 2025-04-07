public class Encapsulation {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
