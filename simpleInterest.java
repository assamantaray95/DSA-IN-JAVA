import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args) {
        System.out.println("Calculate Simple Interest");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount");
        int P = sc.nextInt();
        System.out.println("Your Principal Amount is "+P);
        System.out.println("Enter Time Duration");
        int T = sc.nextInt();
        System.out.println("Your Entered Time Duration is "+T);
        System.out.println("Enter Rate of Interest");
        int R = sc.nextInt();
        System.out.println("Your Rate of Interest is "+R);
        int result = (P*T*R)/100;
        System.out.println("Simple Interest = "+result);
        int Amount = result+P;
        System.out.println("Amount After "+T+" Year = "+Amount);
    }
}