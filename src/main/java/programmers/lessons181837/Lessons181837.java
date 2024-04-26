package programmers.lessons181837;

public class Lessons181837 {
    public static void main(String[] args) {
        String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
        System.out.println(solution(order));
    }
    public static int solution(String[] order) {
        int answer = 0;
        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("any")||order[i].contains("no")){
                answer+=4500;
            }else answer+=5000;
        }
        return answer;
    }
}
