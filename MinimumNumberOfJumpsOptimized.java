public class MinimumNumberOfJumpsOptimized {

    public static int minJump(int[] arr) {
        int jumps = 0, currentJumpEnd = 0, farthest = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);
            if (i == currentJumpEnd) {
                if (farthest <= i) {
                    return -1; 
                }
                jumps++;
                currentJumpEnd = farthest;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // ans 4
        int arr2[] = { 1, 4, 3, 2, 6, 7 };         // ans 2
        int arr3[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 }; // ans 3
        int arr4[] = { 1, 2, 0, 0, 0 }; // ans -1
        int arr5[] = { 9, 10, 1, 2, 3, 4, 8, 0, 0, 0, 0, 0, 0, 0, 1}; //ans 2
        System.out.println("Minimum number of jumps to reach end is : " + minJump(arr1)); 
        System.out.println("Minimum number of jumps to reach end is : " + minJump(arr2));
        System.out.println("Minimum number of jumps to reach end is : " + minJump(arr3));
        System.out.println("Minimum number of jumps to reach end is : " + minJump(arr4)); 
        System.out.println("Minimum number of jumps to reach end is : " + minJump(arr5)); 
    }
}

