import java.util.Scanner;
public class ArraySearchingByInput {
    public static void checkArr(int[] arr, int n){
      for(int i = 0 ; i < arr.length ; i++){
          if(arr[i] ==  n){
             System.out.println(n+" is fount in an array of index "+i);
          }
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
        System.out.println("Enter the Value You Want to Search");
        int m = sc.nextInt();
        checkArr(array, m);
    }
}