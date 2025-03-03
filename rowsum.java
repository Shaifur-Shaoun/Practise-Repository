import java.util.*;

public class rowsum {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int row=sc.nextInt();
        int coloumn=sc.nextInt();

        int arr[][]=new int[row][coloumn];

        int even=0,odd=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<coloumn;j++){
              arr[i][j]=sc.nextInt();
              if(arr[i][j]%2==0){
                even++;
              }
              else{
                odd++;
              }
            }
        }
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<coloumn;j++){
              sum+=arr[i][j];
        }
      }
        System.out.println(sum);
        System.out.println(even);
        System.out.println(odd);
    
}
} 
    

