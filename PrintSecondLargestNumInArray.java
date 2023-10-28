public class PrintSecondLargestNumInArray
{
    public static int findGCD(int[] a) {
        int largest = -1;
        int secondlargest = -1;
       for(int i = 0; i<a.length; i++){
           if(a[i] > largest){
               secondlargest = largest;
               largest = a[i];
            }
            else if (a[i] > secondlargest && a[i] < largest) 
            {
                secondlargest = a[i];
            }
        }
        return secondlargest;
    }
	public static void main(String[] args) {
	    int[] n = {7,1,3, 2,5,6};
		System.out.println(findGCD(n));
	}
}
