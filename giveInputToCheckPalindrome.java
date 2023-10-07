import java.util.Scanner;
public class giveInputToCheckPalindrome {
    
    public static int CheckNumber(int[] arr, int n){
        for(int i=0;i<n;i++){
            if(!isPalindrome(arr[i])){
                return 0;
            }
        }
        return 1;
    }
    public static boolean isPalindrome(int num){
        int originalNum = num;
        int revNumber = 0;
        while(originalNum > 0){
            int lastDigit = originalNum % 10;
            revNumber = revNumber * 10 + lastDigit;
            originalNum /= 10;
        }
        return num == revNumber;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give the array size you want to input");
        int arrsize = sc.nextInt();
        int[] arr = new int[arrsize];
        System.out.println("Enter "+arrsize+" Values");
        for(int i = 0; i < arrsize; i++){
            arr[i] = sc.nextInt();
        }
        int result = CheckNumber(arr, arr.length);
        if(result == 1){
            System.out.println("All are Palindrome");
        }
        else{
            System.out.println("Numbers are not palindrome");
        }
    }
    
}
