import java.util.Scanner;
public class ConinueKeyword {
    public static void checkArr(int[] arr, int Value){
      for(int i = 0 ; i < arr.length ; i++){
          if(arr[i]==  Value){
              continue;
          }
        
        System.out.println(arr[i]);
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
        System.out.println("Enter After which Value you want to Continue the Loop");
        int Value = sc.nextInt();
        System.out.println(Value+" is Not Present In the Numbers because of Continue BreakKeyWord");
        checkArr(array, Value);
    }
}