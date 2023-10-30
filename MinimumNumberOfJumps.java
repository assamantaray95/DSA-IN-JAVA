class MinimumNumberOfJumps { 

    public static int jump(int[] nums) {
        if(nums.length < 2) return 0;
        int i = 0, count = 0, n = nums.length - 2;
        int k1, k2, j = 1, keep;
        while(true){
            if(nums[i] == 0) return -1;
            count++;
            keep = k1 = i + nums[i];
            if(n < k1) return count;
            k2 = k1 + nums[k1];
            for(; j < keep; j++){
                if(k2 <= j + nums[j]){
                    k1 = j;
                    k2 = k1 + nums[k1];
                }
            }
            i = k1;
            j = keep;
        }
    }
    public static void main(String[] args) 
	{ 
//	    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; //ans 4
// 		int arr[] = { 1, 4, 3, 2, 6, 7 }; // ans 2
// 		int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7,6, 8,9 }; // ans 3
// 		int arr[] = { 1, 2, 0, 0, 0 }; //ans Imposible so return -1
        System.out.println("Minimum number of jumps to reach end is : " + jump(arr)); 
	} 
} 
