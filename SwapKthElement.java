import java.util.Arrays;
import java.util.Scanner;
class SwapKthElement{
	public static void checkIndex(int[] arr, int tgtElmt){
	    System.out.print("Array Before Swap = ");
	    System.out.println(Arrays.toString(arr));
		for(int i = 0; i < arr.length; i++)
		{
		   for(int j = arr.length-i-1; j >= arr.length-i-1; j--)
		   {
		      if(i == tgtElmt-1 && j == arr.length-tgtElmt)
		      {
			    int temp = arr[tgtElmt-1];
			    arr[tgtElmt-1] = arr[arr.length-tgtElmt];
			    arr[arr.length-tgtElmt] = temp;
			  }
		   }
		}
		System.out.print("Array After Swap = ");
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter An Array size you want to take ?");
	    int arrSize = sc.nextInt();
	    int[] arr = new int[arrSize];
	    System.out.println("Enter "+arrSize+" Values In An Array");
	    for(int i=0; i < arrSize ; i++){
	        arr[i] = sc.nextInt();
	    }
	    System.out.println("Enter Kth Element To Swap the Value between 1 to "+arr.length); 
	    int kthElement = sc.nextInt();
	    checkIndex(arr, kthElement);
	}
 }
			
