package programmers.lessons181921;
//제한사항
//1 ≤ l ≤ r ≤ 1,000,000
//100,000,000

import java.util.Arrays;
import java.util.LinkedList;

public class Lessons181921 {
    public static void main(String[] args) {
        int l =5;
        int r = 555;
        System.out.println(Arrays.toString(solution(l, r)));
    }

    public static int[] solution(int l, int r) {
        LinkedList<Integer> ans = new LinkedList<>();
        for (int i = l; i <= r; i++) {
            String num = String.valueOf(i);
            boolean unexceptable = true;
            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(j)=='0' || num.charAt(j)=='5'){
                    unexceptable = false;
                }else{
                    unexceptable=true;
                    break;
                }
            }
            if (!unexceptable){
                ans.add(i);
            }
        }
        if (ans.size()==0){
            return new int[]{-1};
        }else {
            int[] answer = new int[ans.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = ans.get(i);
            }
            return answer;
        }
    }
}
