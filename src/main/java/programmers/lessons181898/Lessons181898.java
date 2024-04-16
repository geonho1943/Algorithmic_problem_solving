package programmers.lessons181898;

public class Lessons181898 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1};
        int idx=1;
        System.out.println(solution(arr,idx));
    }
    public static int solution(int[] arr, int idx) {
        for (int i = idx; i < arr.length; i++) {
            if (arr[i]==1){
                return i;
            }
        }
        return -1;
    }
}
