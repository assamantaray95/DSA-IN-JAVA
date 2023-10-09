import java.util.Scanner;
class arraySorting {
    public static void printArray(int[] array, int length)
	{
	    for (int i = 0; i < length; i++) 
	    {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
    public static void sortArray(int[] array, int length)
	{
	    int tempValue = 0;
        for (int i = 0; i < length; i++) 
        {
			for (int j = i + 1; j < length; j++) 
			{
				if (array[i] > array[j]) 
				{
					tempValue = array[i];
					array[i] = array[j];
					array[j] = tempValue;
				}
			}
		}
        System.out.println("Sorted Array in ascending order: ");
		printArray(array, length);
	}
    public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter How Many Elements You Want to Take: ");
	    int arrSize = sc.nextInt();
	    int[] array = new int[arrSize];
	    System.out.println("Enter "+arrSize+" Values");
	    for(int i=0; i < array.length; i++)
	    {
	        array[i] = sc.nextInt();
	 	}
	    int length = array.length;
	    System.out.println("Elements of original array: ");
        printArray(array, length);
        sortArray(array, length);
	}
}
