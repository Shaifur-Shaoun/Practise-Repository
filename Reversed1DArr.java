import java.util.*;

public class Reversed1DArr {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println("original arr :"+Arrays.toString(arr));

        reversearr(arr);
        System.out.println("reversed arr :"+Arrays.toString(arr));

    }
    public static void reversearr(int []arr){
        int left=0,right=arr.length-1;

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
