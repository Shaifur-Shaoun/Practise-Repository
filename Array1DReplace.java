public class Array1DReplace {
    public static void main(String[] args) {
         int arr[]={2,3,4,5,6};

         for(int i=0;i<arr.length;i++){
            if(arr[i]==4){
                arr[i]=88;
            }
         }

         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");

            // for (int val : arr) {
            //     System.out.print(val + " ");
            // }
        }
         }
    }

