package programmers.lessons181870;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lessons181870 {
    public static void main(String[] args) {
        String[] strArr = {"and","notad","abcd"};
        System.out.println(Arrays.toString(solution(strArr)));
    }
    public static String[] solution(String[] strArr) {
        ArrayList<String> ans = new ArrayList<>(List.of(strArr));
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("ad")){
                ans.remove(i);
            }
        }
        return ans.toArray(new String[0]);
    }
}
