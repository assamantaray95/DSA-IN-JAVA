import java.util.Scanner;
public class DaysInJava {
    public static void checkDay(int n){
        switch(n){
            case 1:
                System.out.println("Today is Monday");
            break;
            case 2:
                System.out.println("Today is Tuesday");
            break;
            case 3:
                System.out.println("Today is Wednesday");
            break;
            case 4:
                System.out.println("Today is Thurshday");
            break;
            case 5:
                System.out.println("Today is Friday");
            break;
            case 6:
                System.out.println("Today is Saturday");
            break;
            case 7:
                System.out.println("Today is Sunday");
            break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        checkDay(m);
    }
}