import java.util.Scanner;
public class CheckArmstrongNum{
    public static void checkNum(int num){
       int number = num;
       int countDigits = 0; 
       while(number > 0){
          int digit = number % 10;
          countDigits++;
          number = number / 10;
       }
        System.out.println("Power Of the Number = "+countDigits);
       
        if(checkArmstrong(number , countDigits) == true){
            System.out.println("Success");
        }else{
            System.out.println("Not success");
        }
        
    }
    
    public static boolean checkArmstrong(int digit, int power){
        int sum = 0;
        int compare = digit;
        while(digit > 0){
            int num = digit % 10;
            sum += Math.pow(num , power);
            digit = digit / 10;
        }
        if(compare == sum){
           return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number To Check the Number is Armstrong or Not ?");
        int num = sc.nextInt();
        checkNum(num);
     }
}