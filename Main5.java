public class Main5 {
    public static void main(String[] args) {

        System.out.println(fib(2));

    }
public static int fib(int n){

  //  System.out.println(fib(2));
    if(n<=1){return 1 ;}
    else { return fib(n-1)+fib(n-2); }
    }

}
