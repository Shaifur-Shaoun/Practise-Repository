package Spring2025.OOP_Section04;

public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(double w){
        this.width=2;
        this.height=3;
        this.depth=4;
    }
    public Box(double width,double height,double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;

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
public void setWidth(){
    this.width=width;

}
public void setHeight(){
    this.height=height;

}
public void setDepth(){
    this.depth=depth;

}
public void setDim(){
    this.width=width;
    this.height=height;
    this.depth=depth;
}
public String toString(){
}
}


