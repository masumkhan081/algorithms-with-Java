package Pattern_Matching;
/**
 *
 * @author Masum Khan
 */
public class Z_algorithm {   //   Uploaded, bug checked and commented: 26.06.22

    static String text = "xabcabzabc";
    static String pattern = "abc";

    public static void main(String[] args) {   //  Study Source:     https://youtu.be/CpZh4eF8QBw

        int i, j, count;

        text = pattern + "$" + text; // adding special char between pattern + text .

        //text = "aabxaayaab" + '$' + "aab";   // alternative test case-1

        int z_arr[] = new int[text.length()];
        int len = text.length();

        for (i = 1; i < len; i++) {

            j = 0;
            count = 0;
            while (text.charAt(i + j) == text.charAt(j)) {
                count++;
                j++;
                if (i + j == len) { // checking till last index, not more than that ofcourse
                    break;
                }
            }
            z_arr[i] = count;
        }
        for (i = pattern.length() + 1; i < z_arr.length; i++) { // search for where the value equal to pattern length lies
            if (z_arr[i] == pattern.length()) {
                System.out.println("Pattern Exist At : " + (i - (pattern.length() + 1)));
            }
        }
    }
}
