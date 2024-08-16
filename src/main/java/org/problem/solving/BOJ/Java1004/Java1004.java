package org.problem.solving.BOJ.Java1004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java1004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int[][]  positionSToE = new int[2][2];
            positionSToE[0][0] = Integer.parseInt(st.nextToken());// start X
            positionSToE[0][1] = Integer.parseInt(st.nextToken());// start Y
            positionSToE[1][0] = Integer.parseInt(st.nextToken());// end X
            positionSToE[1][1] = Integer.parseInt(st.nextToken());// end Y
            int N = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                int[] arr = new int[3];
                arr[0] = Integer.parseInt(st.nextToken());// planet X
                arr[1] = Integer.parseInt(st.nextToken());// planet Y
                arr[2] = Integer.parseInt(st.nextToken());// planet R

                double length1 = checkAandB(positionSToE[0][0], positionSToE[0][1],arr[0],arr[1]);
                double length2 = checkAandB(positionSToE[1][0], positionSToE[1][1],arr[0],arr[1]);

                double temp = arr[2];

                if (Math.min(length1,length2) < temp && temp < Math.max(length1,length2)){
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
    private static double checkAandB(int youngX, int youngY, int plentX, int plentY) {
        //두 점간의 거리 반환
        return Math.sqrt( Math.pow(youngX-plentX,2) + Math.pow(youngY-plentY,2));
    }
}