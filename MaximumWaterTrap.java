public class MaximumWaterTrap
{
    static int rainWater(int[] arr){
	int n = arr.length;
        if(n <= 2){
           return 0; 
        }
        int left = 0, right = n-1;
        int leftMax = 0, rightMax = 0;
        int waterTrapped = 0;
        while(left < right){
            if(arr[left] < arr[right]){
                leftMax = Math.max(leftMax , arr[left]);
                waterTrapped += Math.max(0 , leftMax-arr[left]);
                left++;
            } else {
                rightMax = Math.max(rightMax , arr[right]);
                waterTrapped  += Math.max(0 , rightMax-arr[right]);
                right--;
            }
        }
        return waterTrapped;
    }
	public static void main(String[] args) {
	   // int[] arr = { 3, 5, 0, 2 , 0, 4 }; //ans 7
	   // int[] arr = { 6, 9, 9 }; //ans 0
	   // int[] arr = { 7, 4, 0, 9 }; //ans 10
		int[] arr = { 8, 8, 2, 4, 5, 5, 1}; //ans 4
 		System.out.println("Total Rain Water Trapped = "+rainWater(arr));
	}
}
