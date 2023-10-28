public class PrintLargestNumInArray
{
    public static int findGCD(int[] a) {
        int largest = a[0];
       for(int i = 0; i<a.length; i++){
           if(a[i] > largest){
               largest = a[i];
            } 
        }
        return largest;
    }
	public static void main(String[] args) {
	    int[] n = {5, 80, 9, 50, 56};
		System.out.println(findGCD(n));
	}
}
