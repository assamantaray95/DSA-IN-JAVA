import java.util.Scanner;
public class CountNoofDigitesDivisibleByOriginalNumber
{
    public static void Check(int n)
    {
        int counter = 0;
        int number = n;
        while(n>0)
        {
            int x = n%10;
            if(x!= 0 && (number % x) == 0)
            {
                System.out.println("Your Given Number = "+number+" ,digits = "+x);
        	    counter++;
            }
        	 n = n/10;
        }
        if(counter == 0){
         System.out.println("There is no digits found in "+number+" which is divisibe by "+number);   
        }
        else
        {
         System.out.println(counter+" Digits of the Number "+number+" is divisible completely");
         System.out.println("So Your answer is = "+counter);
        }
    }
	public static void main(String[] args) {
	    Scanner inputnum = new Scanner(System.in);
	    System.out.println("Enter a Number To check how many digits are divisible by entered number");
	    int n = inputnum.nextInt();
	    Check(n);
    }
}
