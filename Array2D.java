import java.util.Scanner;

public class Array2D {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
//row then column
int row = 5;
int column = 5;
int[][] a = new int[row][column];
int even = 0, odd = 0;
for(int i = 0; i < row ; i++) {
for(int j = 0; j < column; j++) {
a[i][j] = s.nextInt();
if(a[i][j]%2==0)
even++;
else
odd++;
}
}
int sum = 0;
for(int i = 0; i < row; i++) {
//sum = 0;
for(int j = 0; j < column; j++) {
sum = sum + a[j][i];
}
System.out.println("Column sum: "+sum);
}
}
}
