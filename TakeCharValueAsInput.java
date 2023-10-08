import java.util.Scanner;

public class TakeCharValueAsInput {
    public static void main(String[] args) {
        System.out.println("Enter Character Value!");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.print(ch);

    }
}