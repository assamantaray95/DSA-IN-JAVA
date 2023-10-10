import java.util.Scanner;
public class printOddEven {
    public static void checkNum(int n){
        if(n % 2 == 0){
            System.out.println(n+"  is Even Number");
        }else{
            System.out.println(n+" is odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        checkNum(m);
    }
}