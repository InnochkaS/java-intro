package lesson02;

public class EachNth {

    private static void eachNth(String s, int n) {

        if(s.length() < n)
            return;

        String d = "";
        for(int _i = 0; _i < s.length(); _i += n)
            d += s.charAt(_i);

        System.out.println("Each " + n + " element of the string is : " + d);
    }

    public static void main (String[] args) {

        eachNth("Miracle", 2);
        eachNth("abcdefg", 2);
        eachNth("abcdefg", 3);
    }
}
