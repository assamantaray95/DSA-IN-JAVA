import java.util.Scanner;
public class printNnumberswithoutLoop
{
    public void printNos(int N)
    {
        if(N>0){
           printNos(N-1);
           System.out.print(N+" ");
        }
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value which you want to print without loop");
		int n = sc.nextInt();
		printNnumberswithoutLoop obj = new printNnumberswithoutLoop();
		obj.printNos(n);
		
	}
}
