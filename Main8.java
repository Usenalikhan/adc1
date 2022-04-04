public class Main8{
    public static void main(String args[]){
      String s = "asdf3";
      int n = s.length();
        System.out.println(Fun(s,n-1));

    }
    public static int Fun(String s, int n  ){
        if(s.length()<=1){
            if(Character.isDigit(s.charAt(0))){
                return n;
            }
            else {
                return 0;
            }

        }

        else {
            if(Character.isDigit(s.charAt(n))){
                return 1 + Fun(s,n-1);
            }
            else {
                return 0 + Fun(s,n-1);
            }

        }
    }
}