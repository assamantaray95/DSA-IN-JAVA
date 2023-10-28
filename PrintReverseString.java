public class PrintReverseString
{
    public static String  revString(String a) {
        char[] arr = a.toCharArray();
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }
	public static void main(String[] args) {
	    String n = "Abhimanyu";
		System.out.println(revString(n));
	}
}
