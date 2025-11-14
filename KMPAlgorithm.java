package kmp;

public class KMPAlgorithm {

    // Compute the Longest Prefix Suffix (LPS) array
    public static int[] computeLPSArray(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        int len = 0; // length of the previous longest prefix suffix
        lps[0] = 0; // first character always has LPS = 0

        int i = 1;
        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1]; // fallback
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    // KMP search algorithm
    public static void KMPSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        int[] lps = computeLPSArray(pattern);

        int i = 0; // index for text
        int j = 0; // index for pattern

        System.out.println("Pattern found at indices:");
        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }

            if (j == m) {
                System.out.print((i - j) + " ");
                j = lps[j - 1]; // continue searching for next match
            } else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example 1: Short string
        String text1 = "ababcabcabababd";
        String pattern1 = "ababd";
        System.out.println("Example 1:");
        KMPSearch(text1, pattern1);

        // Example 2: Medium-length string
        String text2 = "this is a simple example to demonstrate KMP string matching algorithm";
        String pattern2 = "example";
        System.out.println("Example 2:");
        KMPSearch(text2, pattern2);

        // Example 3: Long string
        String text3 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        String pattern3 = "aaaaab";
        System.out.println("Example 3:");
        KMPSearch(text3, pattern3);
    }
}
