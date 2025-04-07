import java.util.*;

public class RemoveArr {
    public static void main(String[] args) {
        int [ ]arr={25,14,5,6,7,8};

        System.out.println(Arrays.toString(arr));

        int removeIndex=1;

        for(int i=removeIndex;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
