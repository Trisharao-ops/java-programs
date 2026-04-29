
public class lcs {

    public static void main(String args[]) {
        String a = "aiecnuf";
        String b = "aidiee";
        String Vowels = "aeiouAEIOU";
        String s1 = "";
        for (char ch : a.toCharArray()) {
            if (Vowels.indexOf(ch) != -1) {
                s1 = s1 + ch;
            }
        }
        String s2 = "";
        for (char ch : b.toCharArray()) {
            if (Vowels.indexOf(ch) != -1) {
                s2 = s2 + ch;
            }
        }
        int m = s1.length();
        int n = s2.length();
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        System.out.println(dp[m][n]);
    }
}
