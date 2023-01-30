package java100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
//
//출력
//입력으로 주어진 숫자 N개의 합을 출력한다.
// 84

public class Java11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); //n 무슬모씨
        String num = br.readLine();
        br.close();
        //System.out.println("숫자들 자릿수 확인"+num.length());
        int sum=0;
        for (int i=0; i<num.length(); i++){
            //System.out.println(i+"번째숫자 ="+num.charAt(i));
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
            //System.out.println(1+"번째값을 더한값 ="+sum);
        }
        System.out.println(sum);
    }
}
