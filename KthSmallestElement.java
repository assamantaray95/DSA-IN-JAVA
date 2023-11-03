import java.util.*;
public class KthSmallestElement {
    public static int findSmallestElement(int[] arr) {
         int smallest = arr[0]; 
         for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
	  Arrays.sort(arr);
	  return arr[smallest-1];
    }
	public static void main(String[] args) {
        int[] array = { 7, 10, 4, 3, 20, 15 };
        int smallestElement = findSmallestElement(array);
        System.out.println("The smallest element in the array is: " + smallestElement);
       
    }
}