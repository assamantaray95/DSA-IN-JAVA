public class RepeatAnsMissingAP
{
    static int[] findRepeatAndMissingNum(int[] arr){
        int[] ar = new int[2];
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            int index = Math.abs(arr[i]) - 1;
            if(arr[index] < 0)
            {
                ar[0] = Math.abs(arr[i]);
            }
            else
            {
                arr[index] = -arr[index];
            }
        }
        
        for(int i = 0; i < n; i++)
        {
            if(arr[i] > 0)
            {
                ar[1] = i+1;
                break;
            }
        }
        return ar;
    }
	public static void main(String[] args) {
	    int[] arr = { 1, 3, 3, 4};
	    int[] opt = findRepeatAndMissingNum(arr);
	    for(int a : opt){
		    System.out.println(a+"  ");
	    }
	}
}

