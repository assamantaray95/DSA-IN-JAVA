
import java.util.*;
public class PeakElement {
    static int findPeak(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] >= arr[mid + 1])) {
                
                return arr[mid]; 
            }

            if (mid > 0 && arr[mid - 1] > arr[mid]) {
               
                right = mid - 1;
            } else {
                
                left = mid + 1;
            }
        }

       
        return 0;
    }

    public static void main(String[] args) {
       
        int[] arr = { 3, 4, 2 };

       
        int result = findPeak(arr);
        System.out.println(result);
    }
}

