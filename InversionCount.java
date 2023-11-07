public class InversionCount
{
    static long ans;
    public static long inversionCount(long arr[], long N) 
    {
        ans = 0;
        countInversion(arr, 0, (int)N-1);
        return ans;
    }
    public static void countInversion(long[] arr, int left, int right){
        if(left == right){
            return;
        }
        int mid = (left + right) / 2;
        countInversion(arr, left, mid);
        countInversion(arr, mid+1, right);
        merge(arr, left, mid, right);
    }
    public static void merge(long[] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
    
        long[] left = new long[n1];
        long[] right = new long[n2];
    
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[m + 1 + i];
        }
    
        int i = 0, j = 0, k = l;
    
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                ans += n1 - i;
                arr[k++] = right[j++];
            }
        }
    
        while (i < n1) {
            arr[k++] = left[i++];
        }
    
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }
	public static void main(String[] args) {
	    long[] arr = {4, 3, 1, 5};
		System.out.println(inversionCount(arr, arr.length));
	}
}
