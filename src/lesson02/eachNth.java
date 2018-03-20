package lesson02;

public class eachNth {

    static String d;

    eachNth (String s, int n) {

        int len = s.length();
        for (int i = n - 1; i <= len; i += n) {
            if(d == null)
                d = "" + s.charAt(i);
            else
                d = d + ", " + s.charAt(i);
        }
    }

    public static void main (String[] args) {

        int n = 2;
        eachNth s1 = new eachNth ("abcd", n);

        System.out.println("Each " + n + " element of the string is :" + d);
    }
}
