public class MaximumWaterTrap
{
    static int rainWater(int[] arr){
        int start, end, n;
        int maxWaterHeight = 0;
        int waterCount = 0;
        n = arr.length;
        start = arr[0];
        end = arr[n-1];
        if(start < end){
            maxWaterHeight = start; 
        }
        else{
            maxWaterHeight = end;
        }
        for(int i = 1; i < n-1; i++){
            if(arr[i] < maxWaterHeight){
              int value = maxWaterHeight - arr[i];
               waterCount += value;
            } 
        }
            
        return  waterCount;
    }
	public static void main(String[] args) {
	   // int[] arr = { 3, 5, 0, 2 , 0, 4 }; //ans 7
	   // int[] arr = { 6, 9, 9 }; //ans 0
	   // int[] arr = { 7, 4, 0, 9 }; //ans 10
 		System.out.println("Total Rain Water Trapped = "+rainWater(arr));
	}
}
