
import java.util.Scanner;
public class checkPrime
{
    public static void checkPrime(int n){
        int count = 0;
        for(int i=1; i<=n ;i++){
            if((n % i) == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println(n+" is Prime Number");
        }else{
            System.out.println(n+" is not a prime Number");
        }
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number which you want to check ");
		int n = input.nextInt();
		checkPrime(n);
	}
}
