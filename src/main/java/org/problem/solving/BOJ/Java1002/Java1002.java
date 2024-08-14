package org.problem.solving.BOJ.Java1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //N번 실행
        for (int i = 0; i < N; i++) {
            //변수 초기화
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            // 점 1의 좌표 0으로 세팅 > 피타고라스 뭐시기 사용
            double z = lenthBy1To2(x1,y1,x2,y2);

            // 경우 대응
            if (z == 0 && r1 == r2) {
                System.out.println(-1);
            } else if (z > r1 + r2 || z < Math.abs(r1 - r2)) {
                System.out.println(0);
            } else if (z == r1 + r2 || z == Math.abs(r1 - r2)) {
                System.out.println(1);
            } else System.out.println(2);

        }
    }
    private static double lenthBy1To2(int x1, int y1, int x2, int y2) {
        //두점중 하나를 0,0 으로 세팅후 다른 점 하나를 같은 움직임 만큼 이동 하여 거리 유지
        int lenghX = 0;
        int lenghY = 0;
        if (x1 != 0) lenghX = lenghX-x1;
        if (y1 != 0) lenghY = lenghY-y1;
        lenghX+=x2;
        lenghY+=y2;
        //피타고라스 뭐시기 a2+b2 = c2을 사용
        double length = Math.pow(lenghX,2) + Math.pow(lenghY,2);
        return Math.sqrt(length);
    }
}
