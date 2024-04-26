package programmers.lessons181829;

public class Lessons181829 {
    public static void main(String[] args) {
        int[][] board = {{0, 1, 2},{1, 2, 3},{2, 3, 4},{3, 4, 5}};
        int k = 2;
        System.out.println(solution(board,k));
    }
    public static int solution(int[][] board, int k) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i+j <= k)answer+=board[i][j];
            }
        }
        return answer;
    }
}
