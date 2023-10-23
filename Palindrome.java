import java.util.*;
import java.util.Scanner;
class Palindrome{
  public static void printNum(int n){
      int originalNum = n;
      int reverseNum = 0;
      while(n > 0){
          int lastDigit = n % 10;
          reverseNum = reverseNum * 10 + lastDigit; 
          n = n / 10;
      }
      if(originalNum == reverseNum)
      {
        System.out.println("Palindrome");
      }
      else
      {
        System.out.println("Not Palindrome");
      }
    }
  
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter A Number To Print Reverse");
      int n = sc.nextInt();
      printNum(n);
  }
}