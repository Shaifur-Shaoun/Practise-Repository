import java.util.*;

public class Problem02 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();

      int sum=0,i=1;
      do{
        sum+=i;
        i++;
      }while(i<=N);

      System.out.println(sum);
    }
}
