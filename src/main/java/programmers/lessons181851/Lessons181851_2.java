package programmers.lessons181851;

import java.util.Arrays;

public class Lessons181851_2 {
    public static void main(String[] args) {
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};
        System.out.println(solution(rank,attendance));
    }
    public static int solution(int[] rank, boolean[] attendance) {
        int[] checkRank = new int[rank.length];
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]){
                checkRank[i] = i;
            }else {
                checkRank[i] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(checkRank);
        int answer = checkRank[0]*10000 + checkRank[1]*100 + checkRank[2];
        return answer;
    }
}
