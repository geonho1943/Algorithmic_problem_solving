package programmers.lessons120818;

public class Lessons120818 {
    public static void main(String[] args) {
        int price = 50000;
        System.out.println(solution(price));
    }
    public static int solution(int price) {
        int answer = 0;
        if(price >= 500000){
//            answer =price-(price/5);
            answer = (int) (price-(price*0.2));
        }else if (price >= 300000){
//            answer =price-(price/10);
            answer = (int) (price-(price*0.1));
        }else if (price >= 100000){
//            answer = price-(price/20);
            answer = (int) (price-(price*0.05));
        }else {
            return price;
        }
        return answer;
    }
}
