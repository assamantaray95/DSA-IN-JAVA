import java.util.Scanner;
public class CheckArmstrongNum{
    public static void checkNum(int num){
       int originalNum = num;
       int countDigits = 0; 
       while(num > 0){
          int digit = num % 10;
          countDigits++;
          num = num / 10;
       }
        System.out.println("Power Of the Number = "+countDigits);
        Boolean check = checkArmstrong(originalNum , countDigits);
        if(check == true){
           System.out.println("Sum of All Digits Power "+countDigits+" = "+originalNum); 
           System.out.println("Hence "+originalNum+" is a Armstrong Number");
        }
        else
        {
            System.out.println("Sum of All Digits Power "+countDigits+" !=(Not Equal To) "+originalNum); 
            System.out.println("Hence "+originalNum+" is not a Armstrong number");
        }
    }
    
    public static boolean checkArmstrong(int originalNum, int power){
        int sum = 0;
        int compare = originalNum;
        while(originalNum > 0){
            int num = originalNum % 10;
            sum += Math.pow(num , power);
            originalNum = originalNum / 10;
        }
        if(compare == sum){
            return true;
        }
        else 
        {
          return false;
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number To Check the Number is Armstrong or Not ?");
        int num = sc.nextInt();
        checkNum(num);
     }
}
