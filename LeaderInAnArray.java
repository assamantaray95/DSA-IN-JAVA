import java.util.*;
public class LeaderInAnArray
{
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int maxFromRight = arr[n-1];
        list.add(maxFromRight);
        for(int i = n-2; i >= 0 ; i--){
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                list.add(maxFromRight);
            }
        }
        Collections.reverse(list);
        return list;
    }
	public static void main(String[] args) {
	   // int[] A = {16,17,4,3,5,2} //output = 17 5 2 
		int[] A = {1,2,3,4,0};  // output = 4 0
		System.out.println(leaders(A, A.length));
	}
}
