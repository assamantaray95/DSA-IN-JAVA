import java.io.*; 
import java.util.Scanner;
public class MergeTwoArrays { 
    public static void mergeTwoArray(int[] arr1, int[] arr2)
    {
       System.out.println();
       System.out.print("your first Array values are ");
       for(int i=0; i< arr1.length; i++)
       {
           System.out.print(arr1[i]+" ");
       }
       System.out.println();
       System.out.println();
       System.out.print("your Second Array Values are ");
       for(int i=0; i< arr2.length; i++)
       {
           System.out.print(arr2[i]+" ");
       }
       int mergedArraySize = arr1.length + arr2.length;
       int[] mergedArray = new int[mergedArraySize];
       for(int i=0; i<arr1.length ; i++){
           mergedArray[i] = arr1[i];
       }
       for(int i=0; i<arr2.length ; i++){
           mergedArray[arr1.length + i] = arr2[i];
       }
       System.out.println();
       System.out.println();
       System.out.print("Your Merged Array is  ");
       for(int i=0; i<mergedArray.length; i++){
           System.out.print(mergedArray[i]+" ");
       }
    }
	public static void main(String[] args) 
	{ 
        Scanner sc = new Scanner(System.in);
	    System.out.println("Enter First Array Size");
	    int arr1Size = sc.nextInt();
	    int[] arr1 = new int[arr1Size];
	    System.out.println();
	    System.out.println("Put "+arr1Size+" Numbers in an Arr1");
	    for (int i = 0; i < arr1Size; i++) 
	    { 
			arr1[i] = sc.nextInt(); 
		}
		System.out.println();
	    System.out.println("Enter Second Array Size");
	    int arr2Size = sc.nextInt();
	    int[] arr2 = new int[arr2Size];
	    System.out.println();
	    System.out.println("Put "+arr2Size+" Numbers in an Arr2");
	    for (int i = 0; i <arr2Size; i++) 
        { 
            arr2[i] = sc.nextInt();   
		} 
	    mergeTwoArray(arr1, arr2);
    } 
}
