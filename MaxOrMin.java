import java.util.*;

public class MaxOrMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int row=sc.nextInt();
        int col=sc.nextInt();

        int matrix[][]=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        
        int min=findmin(matrix);
        int max=findmax(matrix);

        System.out.println(min);
        System.out.println(max);
    }


    public static int findmax(int matrix[][]) {
        int max=matrix[0][0];       

        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[i].length;j++){
               if(matrix[i][j]>max){
                max=matrix[i][j];
               }
            }
        }
        return max;
    }
    public static int findmin(int matrix[][]) {
        int min=matrix[0][0]; 
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
               if(matrix[i][j]<min){
                min=matrix[i][j];
               }
            }
        }
        return min;
    }
}

    