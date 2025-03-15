import java.util.*;

public class Problem03 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);

     int N=sc.nextInt();

     int max=Integer.MIN_VALUE;

     for(int i=0;i<N;i++){
        System.out.print(i+1+":");
        int num=sc.nextInt();

        if(num>max){
            max=num;
        }
     }
     System.out.println(max);
    }
}