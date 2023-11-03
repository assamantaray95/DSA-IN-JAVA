public class EquilibriumInArray {
    public static int findSmallestElement(int[] arr) {
	    int totalSum = 0;
		int leftSum = 0;
        for(int i = 0; i < arr.length ; i++){
		    totalSum += arr[i];
		}
		for(int i = 0; i < arr.length ; i++){
		   totalSum -= arr[i];
		   if(leftSum == totalSum){
		     return i+1;
		   }
		   leftSum += arr[i];
		}
		if(arr.length == 1){
		   return 1;
		}
		return -1;
    }
	
	
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 5, 1, 2, 3 };
        int smallestElement = findSmallestElement(array);
        System.out.println("The smallest element in the array is: " + smallestElement);
       
    }
}