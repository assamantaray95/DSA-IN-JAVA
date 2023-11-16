import java.util.*;
public class PairSumChecker {
    private static int countPairsWithSum(int[] array, int targetSum) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int count = 0;
        for (int num : array) {
            int complement = targetSum - num;
            count += frequencyMap.getOrDefault(complement, 0);
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] array = {1, 5, 5, 5, 5, 7};
        int targetSum = 10;

        int numberOfPairs = countPairsWithSum(array, targetSum);

        System.out.println("Number of pairs with sum " + targetSum + ": " + numberOfPairs);
    }
}


