public class Main6 {

    public static int power(int a, int n) {
        if (n != 0) {


            return (a * power(a, n - 1));
        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {

        System.out.println(power(3,3));


    }


}



