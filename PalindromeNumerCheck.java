class PalindromeNumerCheck {
    public static int palinArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (!isPalindrome(a[i])) {
                return 0; 
            }
        }
        return 1;
    }

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (original > 0) {
            reversed = reversed * 10 + original % 10;
            original /= 10;
        }

        return num == reversed;
    }

    public static void main(String[] args) {
        int[] arr = {121, 1331, 12321}; 

        int result = palinArray(arr, arr.length);

        if (result == 1) {
            System.out.println("All elements are palindromes.");
        } else {
            System.out.println("Not all elements are palindromes.");
        }
    }
}
