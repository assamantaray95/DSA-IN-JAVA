import java.util.ArrayList;
class GFG {
    String longest(String names[], int n) {
        String str = "";
        for(int i=0 ; i<n ; i++){
            if(names[i].length() > str.length()) {
                str = names[i];
            }
        }
        return str;
    }
    public static void main(String[] args){
        int N = 5;
        String names[] = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" };
        GFG obj = new GFG();
        String str = obj.longest(names, N);
        System.out.println(str);
    }
}

