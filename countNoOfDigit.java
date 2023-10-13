import java.util.Scanner;
public class countNoOfDigit
{
    public static int countDigit(int n){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give A Numer To Count Digits");
		int m = sc.nextInt();
		System.out.println("Number Of Digits are "+countDigit(m));
	}
}
