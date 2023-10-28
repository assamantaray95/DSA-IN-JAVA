public class GCDofTwoNumber
{
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
	public static void main(String[] args) {
	    int n = 6;
	    int m = 12;
		System.out.println(findGCD(n, m));
	}
}
