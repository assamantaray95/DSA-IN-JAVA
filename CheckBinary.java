import java.util.*;
import java.util.Scanner;
class CheckBinary{
  public static void printNum(int n){
      ArrayList<Integer> list = new ArrayList<Integer>();
      int originalNum = n;
      while(n > 0){
          int k = n % 10;
          list.add(k);
          n = n / 10;
      }
     boolean x =  check(list);
     if(x == true){
         System.out.println(originalNum+" is a Binary Number");
     }
     else
     {
         System.out.println(originalNum+" is Not a Binary");   
     }
  }
  public static boolean check(ArrayList<Integer> list){
      for(int i = 0; i < list.size() ; i++){
          if(list.get(i) != 1 && list.get(i) != 0){
                return false;
          }
          
      }
      return true;
  }
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter A Number To Check Binary Or Not");
      int n = sc.nextInt();
      printNum(n);
  }
}