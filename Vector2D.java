public class Vector2D {
    private double x;
    private double y;
    
    public Vector2D(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public Vector2D add(Vector2D vector){
        this.x=(this.x+vector.x);
        this.y=(this.y+vector.y);
        return new Vector2D (this.x,this.y);
    }
    public Vector2D subtract(Vector2D vector){
        this.x=(this.x-vector.x);
        this.y=(this.y-vector.y);
         return new Vector2D (this.x,this.y);
         
         
    }
    public String toString(){
        return "("+ x +"," +y+")";
    }
    public static void main(String[] args) {
       
        Vector2D v1=new Vector2D(3,4);
        Vector2D v2=new Vector2D(1,2);
        
        System.out.println(v1);
        System.out.println(v2);
        
        System.out.println(v1.getX());
        System.out.println(v1.getY());
        
        
        Vector2D sum=v1.add(v2);
        System.out.println(sum);
        
        Vector2D sub=v1.subtract(v2);
        System.out.println(sub);
        
}
}

