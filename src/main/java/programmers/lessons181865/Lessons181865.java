package programmers.lessons181865;

public class Lessons181865 {
    public static void main(String[] args) {
        String binomial = "43 + 12";
        System.out.println(solution(binomial));
    }
    public static int solution(String binomial) {
        int answer = 0;
        String[] obj = binomial.split(" ");
        int fNum= Integer.parseInt(obj[0]);
        String ob = obj[1];
        int eNum= Integer.parseInt(obj[2]);
        switch (ob){
            case "+":
                answer= fNum+eNum;
                break;
            case "-":
                answer= fNum-eNum;
                break;
            case "*":
                answer= fNum*eNum;
                break;
        }
        return answer;
    }
}
