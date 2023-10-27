class GFG {
    String toLower(String S) {
        String lowerCase  = S.toLowerCase();
        return lowerCase;
    }
    public static void main(String[] args){
        int N = 5;
        String names = "GEEK";
        GFG obj = new GFG();
        String str = obj.toLower(names);
        System.out.println(str);
    }
}

