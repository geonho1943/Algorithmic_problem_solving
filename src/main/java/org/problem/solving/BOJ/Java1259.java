package org.problem.solving.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String str = br.readLine();
            if (str.charAt(0) =='0') {
//                System.out.println("no");
                break;
            }else {
                boolean yn = true;
                for (int i=0;i<str.length()/2;i++){
                    if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                        yn = false;
                        break;
                    }
                }
                if (yn){
                    System.out.println("yes");
                }else System.out.println("no");
            }
        }
    }
}
