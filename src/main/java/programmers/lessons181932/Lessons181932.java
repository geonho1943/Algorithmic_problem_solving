package programmers.lessons181932;

public class Lessons181932 {
    static String code = "abc1abc1abc";
    public static void main(String[] args) {System.out.println(solution(code));}
    public static String solution(String code) {
        int mode =0;
        StringBuilder ret = new StringBuilder();
        char[] arr = code.toCharArray();

        for (int i = 0; i < code.length(); i++) {
            if (mode ==0){
                if (arr[i]=='1'){
                    mode = 1;
                }else {
                    if (i%2==0) ret.append(arr[i]);
                }
            }else {
                if (arr[i]=='1'){
                    mode = 0;
                }else {
                    if (i%2==1)ret.append(arr[i]);
                }
            }
        }
        if (ret.length() == 0) return "EMPTY";
        return ret.toString();
    }
}