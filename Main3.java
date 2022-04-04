class Main3 {
    static boolean FindPrime(int n, int i){

        if (n <= 2){return (n == 2) ? true : false;}

        if (n % i == 0){    return false;}

        if (i * i > n){     return true;}


        return FindPrime(n, i + 1);
    }

    public static void main(String[] args)
    {

        int n = 3;

        if (FindPrime(n, 2))
            System.out.println("Prime");
        else
            System.out.println("Composite");
    }
}
