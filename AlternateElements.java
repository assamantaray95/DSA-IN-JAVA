/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class AlternateElements {

    public static void print(int arr[])
    {
        for(int i = 0; i<arr.length ; i++){
            if((i%2) == 0){
            System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Alternate elements of the array:");
        print(arr);
    }
}
