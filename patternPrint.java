import java.util.Scanner;
public class patternPrint
{
    public static void countDigit(int n){
     System.out.println("Your Pattern is:");
       for(int i=n; i>0 ;i--){
           for(int j=n ; j>0 ;j--){
               for(int k=i; k>0 ; k--){
                   System.out.print(j+" ");
               }
            }
           System.out.println();
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Print Pattern");
		int m = sc.nextInt();
		countDigit(m);
	}
}
