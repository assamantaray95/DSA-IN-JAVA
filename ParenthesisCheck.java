import java.util.*;
public class ParenthesisCheck
{
    public static boolean check(String str){
        Stack<Character>  myStack = new Stack<Character>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '[' || ch == '{'){
                myStack.push(ch);
            }
            else if(ch == '}' || ch == ']'){
                if(myStack.isEmpty()){
                    return false;
                }
                char top = myStack.pop();
                if((ch == '[' && top != ']') || (ch == '{' && top != '}')){
                    return false;
                }
            }
        }
        return true;
    }
	public static void main(String[] args) {
	    String str = "{[{}]}";
		System.out.println(check(str));
	}
}
