package programmers;
public class Solution {
public static void main(String[] args) {
    String s = "hello";
    System.out.println(solution(s));
    }
    static public String solution(String s) {
    StringBuilder sb = new StringBuilder();
    int[] arr = new int[26];
    for (int i = 0; i < s.length(); i++) {
        int idx = s.charAt(i) - 97;
        arr[idx]++;
    }
    for (int i = 0; i < 26; i++) {
        if (arr[i] == 1) sb.append((char) (i + 97));
    }
    return String.valueOf(sb);
    }
}