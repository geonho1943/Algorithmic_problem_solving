package programmers.lessons181866;

import java.util.ArrayList;
import java.util.Arrays;

public class Lessons181866  {
    public static void main(String[] args) {
        String myString = "dxccxbbbxaaaa";
        System.out.println(Arrays.toString(solution(myString)));
    }
    public static String[] solution(String myString) {
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        ArrayList<String> al = new ArrayList<>();
        for (String temp : answer){
            if (!temp.isEmpty()){
                al.add(temp);
            }
        }
        return al.toArray(new String[0]);
    }
}
