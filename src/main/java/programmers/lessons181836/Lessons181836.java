package programmers.lessons181836;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lessons181836 {
    public static void main(String[] args) {
        String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        int k = 2;
        System.out.println(Arrays.toString(solution(picture, k)));
    }
    public static String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < picture.length; i++) {
            String[] enlarge = picture[i].split("");
            String str = "";
            for (int j = 0; j < enlarge.length; j++) {
                str += enlarge[j].repeat(k);
            }
            for (int j = 0; j < k; j++) {
                list.add(str);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
