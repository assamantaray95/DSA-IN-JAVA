class Solution {
    // function to return sum of  1, 2, ... n
    static long seriesSum(int n) {
       int x = n*(n+1)/2;
       return x;
    }
    public static void main(String[] args){
        int n = 3;
        System.out.println(seriesSum(n));
    }
}