import java.util.Arrays;
class ReverseArrayAndCheckEqual{
    
    public boolean IsPerfect(int a[])
    {
        int[] b = reverse(a);
        if(Arrays.equals(a, b)){
            return true;
        }
        else
        {
            return false;
        }
    }
    public int[] reverse(int[] n)
    {
        for(int i=0; i<n.length; i++){
            rev[i] = n[n.length - i - 1
        int[] rev = new int[n.length];];
        }
        return rev;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 2, 1};
        Solution obj = new Solution();
        System.out.println(obj.IsPerfect(arr));
    }
    
}