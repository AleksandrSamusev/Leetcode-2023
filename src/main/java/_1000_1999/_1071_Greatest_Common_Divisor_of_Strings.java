package _1000_1999;

public class _1071_Greatest_Common_Divisor_of_Strings {

    public static void show(String str1, String str2) {
        System.out.println(gcdOfStrings(str1, str2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        while (true) {
            if (str1.equals(str2)) {
                return str1;
            }
            if (!(str1 + str2).equals(str2 + str1)) {
                return "";
            }
            if (str1.length() > str2.length()) {
                str1 = str1.substring(str2.length());
            }
            if (str2.length() > str1.length()) {
                str2 = str2.substring(str1.length());
            }
        }
    }
}
