package programmers.lessons181851;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Lessons181851_3 {
    public static void main(String[] args) {
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};
        System.out.println(solution(rank,attendance));
    }
    public static int solution(int[] rank, boolean[] attendance) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> intList = new ArrayList<Integer>();
        for (int i = 0; i < rank.length; i++) map.put(rank[i],i );
        for (int i=0; i<rank. length; i++){
            if(attendance[i]){
                intList.add (rank[i]);
            }
        }
        Collections.sort(intList);
        int a = map.getOrDefault(intList.get(0), 0);
        int b = map.getOrDefault(intList.get (1), 0);
        int c = map.getOrDefault(intList.get(2), 0);
        int answer = a*10000 + b*100 + c;
        return answer;
    }
}
