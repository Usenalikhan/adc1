public class Main4 {
    public static void main(String[] args) {
        System.out.println(findFact(5));
    }

    public static int findFact(int n){
        if(n>=1){
            return n*findFact(n-1);
        }
        else if(n==1||n==0){
            return 1;
        }
        else {return 0;}

    }
}
