public class Main7 {
    static int swap(int[] arr, int n) {

        if (n <= 1){
            return arr[0];
}
        else {
            System.out.print(arr[n]+" ");
            return swap(arr,n-1);
        }
}

    public static void main(String args[]) {
        int arr[] = {2,3,4,5,4,3,2,1};
        int n = arr.length;
        System.out.println(swap(arr,n-1));

    }
}