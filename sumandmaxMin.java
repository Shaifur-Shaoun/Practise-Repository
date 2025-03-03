import java.util.*;

public class sumandmaxMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int row=sc.nextInt();
        int col=sc.nextInt();

        int arr[][]=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<row;i++){
            
                sum+=arr[i][i];
    
    
}
    

int max=arr[0][0];       

for(int i=0;i<arr.length;i++){

    for(int j=0;j<arr[i].length;j++){
       if(arr[i][j]>max){
        max=arr[i][j];
       }
    }
}



int min=arr[0][0]; 
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
       if(arr[i][j]<min){
        min=arr[i][j];
       }
    }
}
System.out.println(sum);
System.out.println(max);
System.out.println(min);

    }
}




    

        

    
    


