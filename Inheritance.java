class Person{
    String name;
    int age;

    

}
class Teacher extends Person{
    String qualification;
}



public class Inheritance {
    public static void main(String[] args) {
        
        Teacher t1=new Teacher();

        t1.name= "Ali";
        t1.age= 43;
        t1.qualification="BSc in CSE";

        System.out.println(t1.name);
        System.out.println(t1.age);
        System.out.println(t1.qualification);

    }
}
