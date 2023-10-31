import java.util.ArrayList;
import java.util.Collections;
public class PrintRepeatedNumberInSortedFormat {
    public static ArrayList<Integer> findRepeatedNumbers(int[] arr) {
        ArrayList<Integer> repeatedNumbers = new ArrayList<>();
         Collections.sort(repeatedNumbers);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !repeatedNumbers.contains(arr[i])) {
                    repeatedNumbers.add(arr[i]);
                }
            }
        }
        Collections.sort(repeatedNumbers);
        return repeatedNumbers;
    }

    public static void main(String[] args) {
        int[] arr = {10 ,10, 2, 2, 3, 4, 2, 1, 5, 6, 3, 5};

        ArrayList<Integer> repeatedNumbers = findRepeatedNumbers(arr);

        System.out.println("Repeated numbers: " + repeatedNumbers);
    }
}
