class Marks {
    String name;
    int sub1;
    int sub2;
    int sub3;
    

   Marks(String name,int sub1,int sub2,int sub3){
        this.name=name;
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
   }
       
double Ave(){
    return (sub1+sub2+sub3)/3.0;
 }
 
 void display(){
    System.out.println("Name :"+name+" , average :"+Ave());
 }

 
 public static void main(String[] args) {
    Marks[ ] mark=new Marks[5];

    mark[0]=new Marks("Alice", 30, 60, 90);
    mark[1]=new Marks("Alice", 30, 60, 90);
    mark[2]=new Marks("Alice", 90, 60, 90);
    mark[3]=new Marks("nol", 30, 60, 90);
    mark[4]=new Marks("Alice", 30, 60, 90);

     for(Marks M: mark){
        M.display();
     }

     mark[2]=new Marks("Kill", 56, 69, 90);
     
     System.out.println("Replace :");
     for(Marks M: mark){
        M.display();
     }

 }
}

