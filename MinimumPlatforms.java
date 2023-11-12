import java.util.*;

public class MinimumPlatforms {

    public static int findMinPlatforms(int[] arr, int[] dep) {
       Arrays.sort(arr);
       Arrays.sort(dep);
       int i = 1; //Arival Pointer
       int j = 0; //Departure Pointer
       int minNeededPlatForm = 1;
       int result = 1;
       while(i < arr.length && j < arr.length){
           if(arr[i] <= dep[j]){
               minNeededPlatForm++;
               i++;
           }
           else if(arr[i] > dep[j]){
               minNeededPlatForm--;
               j++;
           }
           result = Math.max(minNeededPlatForm, result);
       }
       return  result;
    }

    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        // int[] arr = {900, 1100, 1235};
        // int[] dep = {1000, 1200, 1240};

        int minPlatforms = findMinPlatforms(arr, dep);
        System.out.println("Minimum platforms needed: " + minPlatforms);
    }
}

