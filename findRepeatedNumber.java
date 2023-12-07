import java.util.*;

public class RepeatAndMissingNum {
    static int[] findRepeatMissingNum(int[] arr) {
        HashSet<Integer> uno = new HashSet<>();
        int[] ans = new int[2];
        int n = arr.length;
        int apSum = n*(n+1)/2;
        int repNum = 0;
        for (int num : arr) {
            if(!(uno.add(num)))
            {
                repNum = num;
            }
            uno.add(num);
        }
        List<Integer> list = new ArrayList<>(uno);
        int[] resultArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            resultArray[i] = list.get(i);
        }
        int arrSum = Arrays.stream(resultArray).sum();
        int missingNum = apSum - arrSum;
        ans[0] = missingNum;
        ans[1] = repNum;
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
