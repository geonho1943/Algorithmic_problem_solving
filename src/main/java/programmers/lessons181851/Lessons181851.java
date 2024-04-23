package programmers.lessons181851;

import java.util.Arrays;
import java.util.HashMap;

public class Lessons181851 {
    //잘못된 방법 같다
    public static void main(String[] args) {
//        int[] rank = {3, 7, 2, 5, 4, 6, 1};
//        boolean[] attendance = {false, true, true, true, true, false, false};
        int[] rank = {6, 1, 5, 2, 3, 4};
        boolean[] attendance = {true, false, true, false, false, true};
        System.out.println(solution(rank,attendance));
    }
    public static int solution(int[] rank, boolean[] attendance) {
        int[] ans = new int[3];
        HashMap<Integer,Integer> asd = new HashMap<>();
        for (int i = 0; i < rank.length; i++) {
            asd.put(rank[i],i);
        }
        Arrays.sort(rank);
        int j =0;
        for (int i = 0; i < rank.length; i++) {
            if (attendance[asd.get(rank[i])]&& j<3) {
                ans[j] = rank[i];
                j++;
            }
        }
        int answer = ans[0]*10000 + ans[1]*100 + ans[2];

        return answer;
    }
}
