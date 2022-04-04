 class Main {

     public static int findMin(int arr[], int i) {

        if(i <= 1){return arr[0];}
        else{ return Math.min( findMin(arr, i-1),arr[i-1]);}

     }


     public static void main(String args[])
     {
         int arr[] = {1, 4, 45, 6, -50, 10, 2};
         int n = arr.length;


         System.out.println(findMin(arr, n));

         }
     }







