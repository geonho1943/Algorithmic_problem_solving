package org.problem.solving.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// for문 빠져나갈때 return으로 해결 할수 없어서 메서드를 사용했다
// 알고리즘 할때 메서드 별로 안좋아 하지만 이제부터 계속 써야겠다

public class Java1254 {
    private static boolean prt_yn(String str) {
        int sta = 0;
        int la = str.length()-1;
        while (sta <= la) {
            if(str.charAt(sta) != str.charAt(la))
                return false;
            sta++; la--;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        int ans = str.length();
        for (int i=0; i < str.length(); i++) {
            if (prt_yn(str.substring(i))) break;
            ans++;
        }
        System.out.println(ans);
    }
}


