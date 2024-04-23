package programmers.lessons181855;

import java.util.Arrays;

public class Lessons181855 {
    public static void main(String[] args) {
        String[] strArr = {"a","bc","d","efg","hi"};
        System.out.println(solution(strArr));
    }
    public static int solution(String[] strArr) {
        int[] count = new int[100000];
        for(int i = 0 ; i < strArr.length; i++) {
            count[strArr[i].length()]++;
        }
        return Arrays.stream(count).max().getAsInt();
    }
}
