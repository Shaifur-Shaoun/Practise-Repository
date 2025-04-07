class Box1 {
   private double width;
   private double height;
   private double depth;
   
   public Box1(){
    this.width=0;
    this.height=0;
    this.depth=0;
   }
   public Box1( double len){
    this.width=len;
    this.height=len;
    this.depth=len;
 }
public Box1(double width, double height,double depth){
    this.width=width;
    this.height=height;
    this.depth=depth;
}
public Box1(Box1 box){
    this.width=box.width;
    this.height=box.height;
    this.depth=box.depth;
}
public double getWidth(){
    return width;
}
public double getHeight(){
    return height;
}
public double getDepth(){
    return depth;
}
public void setWidth(double width){
    this.width=width;
}
public void setHeight(double height){
    this.height=height;
}
public void setDepth(double depth){
    this.depth=depth;
}
public void setDim(double width, double height,double depth){
    this.width=width;
    this.height=height;
    this.depth=depth;
}

public boolean equalTo(Box1 o){
   return this.width==o.width && this.height==o.height && this.depth==o.depth;
}

public double volume(){
    return width*height*depth;
}

public String toString(){
    return "Box1 [width="+ width +",height="+height+",depth="+depth+"]";
}
public static void main(String[] args) {
    Box1 b1=new Box1();
    Box1 b2=new Box1(2);
    Box1 b3=new Box1(3,4,5);
    Box1 b4=new Box1(b3);

    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);

    b1.setWidth(2);
    b1.setHeight(3);
    b1.setDepth(4);
    System.out.println(b1);

    System.out.println(b3.getWidth());
    System.out.println(b3.getHeight());
    System.out.println(b3.getDepth());

    b1.setDim(6,7,8);
    System.out.println(b1);

    System.out.println(b4.equalTo(b3));
    System.out.println(b1.equalTo(b3));

    System.out.println(b1.volume());
    System.out.println(b3.volume());
 
}

}

