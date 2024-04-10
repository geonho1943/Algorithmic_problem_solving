package programmers.lessons181916;

import java.util.Arrays;

public class Lessons181916 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 2;
        int d = 2;
        System.out.println(solution(a,b,c,d));
    }
    public static int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = {a,b,c,d};
        int[] temp = {0,0,0,0,0,0};
        int count=0;
        for (int i = 0; i < 4; i++) {
            temp[arr[i]-1]++;
        }
        if (a!=b && b!=c && c!=d && a!=c && a!=d && b!=d){// 중복이 없을 경우
            int minTemp=6;
            for (int i = 0; i < 4; i++) {
                minTemp = Math.min(minTemp, arr[i]);
            }
            return minTemp;
        }

        for (int i = 0; i < 6; i++) {
            if (temp[i]==4) return 1111*(i+1); // 4번이 모두 같을경우
            else if (temp[i] == 3) {
                for (int j = 0; j < 6; j++) {
                    if (temp[j]==1){
                        return (10*(i+1)+j+1)*(10*(i+1)+j+1);
                    }
                }
            }

        }
        for (int i = 0; i < 6; i++) {
            if (temp[i] == 2) {
                for (int j = i+1; j < 6; j++) {
                    if (temp[j] == 2) { //2개씩 두쌍이 같을경우
                        return (i+1 + j+1) * (j-i);
                    } else if (temp[j] == 1) { //2개는 같지만 나머지가 서로 다를경우
                        for (int k = 0; k < 6; k++) {
                            if (temp[k] == 1 && k!=j) {
                                return (j+1)*(k+1);
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}
