import java.util.Scanner;
public class MedianCalculator{
    public static void ArraySort(int[] arr){
       int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        CalulateMedian(arr);
    }
    public static void CalulateMedian(int[] arr) {
        int firstElement , secondElement;
        if(arr.length % 2 != 0)
        {
            int countMedian = (arr.length + 1) / 2;
            System.out.println("Median of these Numbers = "+arr[countMedian-1]);
        }
        else
        {
            firstElement = arr[(arr.length / 2)-1];
            secondElement = arr[(arr.length / 2)];
            float countMedian = (float)(firstElement + secondElement) / 2; 
            System.out.println("Median of these Numbers = "+countMedian);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Array Size");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        System.out.println("Enter "+arrSize+" Values In an Array");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        ArraySort(arr);
     }
}