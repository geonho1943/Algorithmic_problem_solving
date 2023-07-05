package org.problem.solving.BOJ.Java1107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java1107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int channel = Integer.parseInt(br.readLine());
        int brokenBtnNum = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        boolean[] brokenBtnArray = new boolean[10];
        if (brokenBtnNum !=0){
            for (int i = 0; i < brokenBtnNum; i++) {
                int temp = Integer.parseInt(st.nextToken());
                brokenBtnArray[temp] = true;
            }
        }
        //입력 끝
        int ans = Math.abs(channel -100);
        for (int i = 0; i <= 999999; i++) {
            String tempNum = String.valueOf(i);//임시 번호
            int len = tempNum.length();//누른 번호의 길이
            boolean impossibleNum = false;
            for (int j = 0; j < len; j++) {
                if (brokenBtnArray[tempNum.charAt(j) - '0']) {
                    impossibleNum =true;
                    break;
                }
            }
            if (!impossibleNum){
                int min = Math.abs(channel -i)+ len;
                ans = Math.min(min,ans);
            }
        }
        System.out.println(ans);
    }
}
