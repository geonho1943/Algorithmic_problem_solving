package programmers.lessons181926;

public class Lessons181926 {
    public static void main(String[] args) {
        int n =0;
        String control ="wsdawsdassw";
        System.out.println(solution(n,control));

    }
    public static int solution(int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            if (control.charAt(i)=='w'){
                n+=1;
            } else if (control.charAt(i)=='s') {
                n-=1;
            }else if (control.charAt(i)=='d') {
                n+=10;
            }else if (control.charAt(i)=='a') {
                n-=10;
            }
        }

        return n;
    }
}
