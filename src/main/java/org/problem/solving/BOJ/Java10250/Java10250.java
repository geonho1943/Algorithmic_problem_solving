package org.problem.solving.BOJ.Java10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int H = Integer.parseInt(st.nextToken());
            st.nextToken();
            int N = Integer.parseInt(st.nextToken());
            sb.append(inToRoom(H,N)+"\n");
        }
        br.close();
        System.out.println(sb);
    }

    private static int inToRoom(int H, int N) {
        int x = (N%H)*100;// XX00 몇증인지
        int y = N/H+1;//00XX 몇번방 인지
        if(x == 0){
            x=H*100;
            y-=1;
        }
        return x+y;
    }
}
