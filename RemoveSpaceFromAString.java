import java.util.Scanner;
public class RemoveSpaceFromAString
{
    public static void removeSpace(String str){
        String spaceRemovedString = str.replace(" ","");
		System.out.println("After Remove All The Spaces = "+spaceRemovedString);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Give Input A String With Spaces");
	    String str = sc.nextLine();
	    System.out.println("Original String = "+str);
		removeSpace(str);
	}
}
