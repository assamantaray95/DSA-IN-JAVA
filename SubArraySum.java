import java.util.ArrayList;
public class SubArraySum
{
    static ArrayList<Integer> subArraySum(int[] arr, int sum){
        ArrayList<Integer> list = new ArrayList<Integer>();
          int left = 0;
          int right = 0;
          int currentSum = 0;
        while(right < arr.length){
          currentSum += arr[right];
        while(currentSum > sum){
              currentSum -= arr[left];
              left++;
          }
          if(currentSum == sum && sum != 0){
             list.add(left+1);
             list.add(right+1);
             return list;
          }
         right++;  
        }
      list.add(-1);
      return list;
    }
	public static void main(String[] args) {
	  int[] arr = {1, 2, 3, 4, 7};
	  int sum = 14;
	  System.out.println(subArraySum(arr, sum));
	}
}
