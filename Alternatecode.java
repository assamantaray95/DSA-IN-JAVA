import java.util.*;

public class RepeatAndMissingNum {
    static int[] findRepeatMissingNum(int[] arr) {
        HashSet<Integer> seenSet = new HashSet<>();
        int[] ans = new int[2];
        int n = arr.length;
        int apSum = n * (n + 1) / 2;
        int arrSum = 0;
        int repNum = 0;

        for (int num : arr) {
            if (!seenSet.add(num)) {
                repNum = num;
            }
            arrSum += num;
        }
        int missingNum = apSum - arrSum + repNum;
        ans[0] = missingNum;
        ans[1] = arrSum;
        return ans;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 3, 4, 5, 6, 7, 6, 8, 9 };
        int[] arr = {1, 2, 3, 3, 4, 5};
        int[] resultArray = findRepeatMissingNum(arr);

        for (int a : resultArray) {
            System.out.println(a + " ");
        }
    }
}
