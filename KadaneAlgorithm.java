import java.util.Scanner;
public class KadaneAlgorithm{
    public static void KadaneCheck(int[] arr){
        int min_Integer = Integer.MIN_VALUE;
        int max_End = 0;
        for(int i = 0; i < arr.length; i++){
            max_End += arr[i];
            if(min_Integer < max_End){
                min_Integer = max_End;
            }
            if(max_End < 0){
                max_End = 0;
            }
        }
        System.out.println("According To kadane Maximum Sum  = "+min_Integer);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter An Array Length : ");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        System.out.print("Enter "+arrSize+" Values ");
        for(int i = 0; i < arrSize ; i++){
            arr[i] = sc.nextInt();
        }
        KadaneCheck(arr);
    }
}