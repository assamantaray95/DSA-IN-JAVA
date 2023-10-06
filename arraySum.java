/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class arraySum
{
    public static int sumElement(int arr[])
    {
        int sum = 0;
        for(int i=0; i<arr.length ; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
       int arr[] = {5, 6, 7, 8, 9};
       System.out.println(sumElement(arr));
    }
}
