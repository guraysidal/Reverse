public class Reverse {
    static String[]original={"a","b","c","d","e","f","g","h","i","j"};
    static String[]reverse=new String[10];
    static String[] createReverse(String[] arr){
        for(int i=9;i>=0;i--){reverse[9-i]=original[i];}
        return reverse;
    }
    public static void main(String[]args){
        createReverse(original);
        for (String zeichen:original){System.out.println(zeichen);}
        for (String zeichen:reverse){System.out.println(zeichen);}
    }
}
