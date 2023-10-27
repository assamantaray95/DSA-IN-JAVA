import java.util.Scanner;
class FindNthAP {
    int nthTermOfAP(int A1, int A2, int N) {
        int d = A2 - A1;
        int nthTerm = A1+(N-1)*d;
        return nthTerm;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st term of AP: ");
        int A1 = sc.nextInt();
        System.out.println("Enter 2nd term of AP: ");
        int A2 = sc.nextInt();
        System.out.println("Enter which term You want ? ");
        int N = sc.nextInt();
        FindNthAP obj = new FindNthAP();
        int str = obj.nthTermOfAP(A1, A2, N);
        System.out.println("Your Desired term is: ");
        System.out.println(str);
    }
}

