package _1_999._100_199;

public class _151_Reverse_Words_in_a_String {

    public static void show(String s) {
        System.out.println(reverseWords(s));
    }


    public static String reverseWords(String s) {
        String[] arr = s.trim().split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length -1; i>= 0; i--) {
            sb.append(arr[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

}
