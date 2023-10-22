class CountLessThanNumbers{
    public static void checkLessThan(int[] arr, int n){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < n){
                count++;
            }
        }
        System.out.print(count+" Numbers Present");
    }
    public static void main(String[] args){
        int[] arr = {5, 2 ,3 ,4 ,5};
        int n = 4;
        checkLessThan(arr, n);
    }
}