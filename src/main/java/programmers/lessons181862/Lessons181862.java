package programmers.lessons181862;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lessons181862 {
    public static void main(String[] args) {
        String myStr = "cabab";
        System.out.println(Arrays.toString(solution(myStr)));
    }
    public static String[] solution(String myStr) {
        LinkedList<String> ans = new LinkedList<>();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < myStr.length(); i++) {
            if (myStr.charAt(i)=='a'||myStr.charAt(i)=='b'||myStr.charAt(i)=='c'){
                //나누기
                if (temp.length()!=0){
                    ans.add(String.valueOf(temp));
                    temp.delete(0,temp.length());
                }
            }else {
                temp.append(myStr.charAt(i));
            }
        }
        if (temp.length()!=0) ans.add(String.valueOf(temp));
        String[] answer = ans.toArray(new String[0]);
        if (answer.length ==0){
            return new String[] {"EMPTY"};
        }
        return answer;
    }
}
