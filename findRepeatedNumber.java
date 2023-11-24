import java.util.*;
public class Main {
    static int[] findRepeatedNumber(int[] arr) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        int[] ar = new int[2]; 
        int n = arr.length;
        int sum = n*(n+1)/2;
        int newSum = 0; 
        int repeatNum = 0;
        for (int num : arr) {
            uniqueNumbers.add(num);
            if (!uniqueNumbers.add(num)) {
                repeatNum =  num;
            }
        }
        for(int hash : uniqueNumbers){
            newSum += hash; 
        }
        int missingNum  = sum - newSum;
        ar[0] = missingNum;
        ar[1] = repeatNum;
        return ar;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 6, 4, 5, 2};
        int[] repeatedNumber = findRepeatedNumber(numbers);
        for(int value : repeatedNumber){
            System.out.print(" " + value + " ");
        }
        
    }
}