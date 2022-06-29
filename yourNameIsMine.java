import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class yourNameIsMine {
    /*
    2) Your Name is Mine:

    In an attempt to control the rise in population, Archer was asked to come up with a plan. This time he is targeting marriages. Archer, being as intelligent as he is, came up with the following plan:
    A man with name M is allowed to marry a woman with name W, only if M is a subsequence of W or W is a subsequence of M.
    A is said to be a subsequence of B, if A can be obtained by deleting some elements of B without changing the order of the remaining elements.
    Your task is to determine whether a couple is allowed to marry or not, according to Archer's rule.
    Input
    The first line contains an integer T, the number of test cases. T test cases follow. Each test case contains two space separated strings M and W.
    Output
    For each test case print "YES" if they are allowed to marry, else print "NO".(quotes are meant for clarity, please don't print them)
    Constraints
    · 1 ≤ T ≤ 100
    · 1 ≤ |M|, |W| ≤ 25000 (|A| denotes the length of the string A.)
    · All names consist of lowercase English letters only.

    Sample 1:

    Input:

    3
    john johanna
    ira ira
    kayla Jayla

    Output:

    YES
    YES
    NO

    Explanation:
    Case 1: Consider S = "johanna". So, S[0] = 'j', S[1] = 'o', S[2] = 'h' and so on. If we remove the indices [3, 4, 6] or [3, 5, 6] from S, it becomes "john". Hence "john" is a subsequence of S, so the answer is "YES".
    Case 2: Any string is a subsequence of itself, as it is formed after removing "0" characters. Hence the answer is "YES".
    Case 3: "jayla" cannot be attained from "kayla" as removing any character from "kayla" would make the string length smaller than "jayla",also there is no 'j' in "kayla". Similar reasoning can be applied to see why "kayla" can't be attained from "jayla".Hence the answer is "NO".
     */
    

    public static String[] solution(Scanner sc, int T) {
        String[] ans = new String[T];
        String[][] arr1 = new String[T][2];
        String s1 = "";
        String test = "";
        sc.nextLine(); //eats newline
        for(int i = 0; i < T; i++) {
            s1 = sc.nextLine();
            String[] temp = s1.split(" ");
            String word1 = temp[0];
            String word2 = temp[1];
            
            if(word1.equalsIgnoreCase(word2)) {
                ans[i] = "YES";
                continue;
            }

            for(int j = 0; j < word1.length(); j++) {
                for(int k = 0; k < word2.length(); k++) {
                    if(word1.charAt(j) == word2.charAt(k)) {
                        test += word1.charAt(j);
                        break;
                    }
                }
            }

            if(word1.equalsIgnoreCase(test) || word2.equalsIgnoreCase(test)) {
                ans[i] = "YES";
            } else {
                ans[i] = "NO";
            }
            
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Your name is mine: ");
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] ans = solution(sc, T);
        for(String s: ans) {
            System.out.println(s);
        }
        sc.close();
    }
}