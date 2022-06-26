package Pattern_Matching;

/**
 *
 * @author Masum Khan
 */
public class Wild_Card_Matching {   //  Dynamic Approach  //  Commented & Uploaded: 26.06.22

    public static void main(String[] args) {       // study source:  https://youtu.be/3ZDZ-N0EPV0
        String str_text = "xaylmz";
        String str_patt = "x?y*z";      // ? - means any char, * -means 0 or more characters
        //      str_patt = "a*b";
//       str_patt = "a?b";

        //
        int len_patt = str_patt.length();
        int len_text = str_text.length();
        int i, j;
        boolean arr[][] = new boolean[len_text + 1][len_patt + 1];

        for (i = 0; i <= len_text; i++) {
            arr[i][0] = false;
        }
        for (j = 0; j <= len_patt; j++) {
            arr[0][j] = false;
        }
        arr[0][0] = true;
        //
        for (i = 1; i <= len_text; i++) {
            for (j = 1; j <= len_patt; j++) {
                if (str_text.charAt(i - 1) == str_patt.charAt(j - 1)) {
                    arr[i][j] = true;
                }
                if (str_patt.charAt(j - 1) == '?') {
                    arr[i][j] = arr[i - 1][j - 1];
                }
                if (str_patt.charAt(j - 1) == '*') {
                    if (arr[i][j - 1] == true) {
                        arr[i][j] = arr[i][j - 1];
                    }
                    if (arr[i - 1][j] == true) {
                        arr[i][j] = arr[i - 1][j];
                    }
                }
            }
        }
        if (arr[len_text][len_patt] == true) {
            System.out.println("Pattern Exist/Match !");
        } else {
            System.out.println("Pattern Doesn't Match !");
        }

        for (i = 0; i <= len_text; i++) {
            System.out.println("");
            for (j = 0; j <= len_patt; j++) {
                System.out.print(arr[i][j] + "    ");
            }
        }
    }
}
