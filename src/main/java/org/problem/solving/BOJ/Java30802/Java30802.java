package org.problem.solving.BOJ.Java30802;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] sml = new int[6];
        for (int i = 0; i < 6; i++) {
            sml[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int tSet = 0;
        int remainder = 0;
        for (int i = 0; i < 6; i++) {
            tSet += sml[i]/t;
            if (sml[i]%t != 0){
                tSet++;
            }
        }
        int pSet = n/p;
        int pSetRemainder = n%p;
        System.out.println(tSet);
        System.out.println(pSet+" "+pSetRemainder);

    }
}


//23
//3 1 4 1 5 9
//5 7