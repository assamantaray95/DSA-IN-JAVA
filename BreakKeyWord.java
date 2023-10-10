import java.util.Scanner;
public class BreakKeyWord {
    public static void checkArr(int[] arr, int Value){
      for(int i = 0 ; i < arr.length ; i++){
          if(i ==  (Value+1)){
              break;
          }
        System.out.println("In Index "+i+" Value = "+arr[i]);
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Element You Want to Enter In an Array");
        int arrSize = sc.nextInt();
        int[] array = new int[arrSize];
        System.out.println("Enter "+arrSize+" Values");
        for(int i = 0 ; i < arrSize ; i++){
            array[i] = sc.nextInt();
        }
        
       System.out.println("Enter Till Which INDEX You Want to Print between 0 to "+arrSize);
       int Value = sc.nextInt();
       System.out.println("In an Array tille INDEX "+Value+" These Numbers are Present");
       checkArr(array, Value);
    }
}