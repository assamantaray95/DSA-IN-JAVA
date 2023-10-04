import java.util.Scanner;
public class ArraySearching
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("Enter Your Array Size");
    int arrSize = sc.nextInt ();
      System.out.println ("Your Array Size is = " + arrSize);
      System.out.println ("Insert " + arrSize + " Values");
    int[] array = new int[arrSize];
    for (int i = 0; i < arrSize; i++)
      {
	array[i] = sc.nextInt ();
      }
    System.
      out.println ("Please enter which value you want to search in an array");
    int searchValue = sc.nextInt ();
    System.out.println ("You Want to search  " + searchValue);
    for (int i = 0; i < array.length; i++)
      {
	if (array[i] == searchValue)
	  {
	    System.out.print (searchValue + " Found In the Array of Index " +
			      i);
	  }
      }
  }
}
