import java.util.Scanner;
public class ternaryOperator {
    public static void checkNum(int n){
       String ans = (n % 2) == 0 ? n+" is even" : n+" is odd";
       System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        checkNum(m);
    }
}