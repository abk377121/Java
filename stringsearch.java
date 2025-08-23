import java.util.*;
public class stringsearch {
    void KMPSearch(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();
        int lps[] = new int[M];
        computeLPSArray(pat, M, lps);
        int i = 0; // index for txt[]
        int j = 0; // index for pat[]
        while (N - i >= M - j) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }
            if (j == M) {
                System.out.println("Found pattern at index " + (i - j));
                j = lps[j - 1];
            } else if (i < N && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
    }
    void computeLPSArray(String pat, int M, int lps[]) {
        int len = 0; // length of previous longest prefix suffix
        lps[0] = 0; // lps[0] is always 0
        int i = 1;
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
public static void main(String[] args) {
        stringsearch ss = new stringsearch();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern to search:");
        String pat = sc.nextLine();
        System.out.println("Enter the text to search in:");
        String txt = sc.nextLine();
        ss.KMPSearch(pat, txt);
        sc.close();
    }
}
