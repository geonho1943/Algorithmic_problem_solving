package org.problem.solving.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//문제
//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
//
//입력
//첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
//
//출력
//첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
//Mississipi ?
//zZa Z
//z Z
//baaa A


//이전에 아스키 변환 문제를 풀어봐서 구상은 쉬웠지만 쵀대 사용 알파벳이 여러개 존재할때 ?출력을 감안하지않아서 추후 구현에 시간이 많이 들었다...
//
public class Java1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toLowerCase();
        br.close();
        int arr[] = new int[26];

        for (int i=0;i<s.length();i++){//알파벳 배열에 받은문자의 알파벳 횟수만큼 +1
            char n = s.charAt(i);
            arr[n-'a']+=1;
        }
        int max =0;
        int num=0;
        int temp=0;
        char ans;
        for (int i=0;i<arr.length;i++){
            num=arr[i];
            if (max < num){ //알파벳 배열에서 중복되는알파벳 횟수 중 최댓값 저장
                max=num;
                temp=i; //그값의 해당 알파벳 temp에 저장
            }else if (arr[i] == max) { //최댓값이 겹친다면 "?"를 출력
                temp = -2; //65를 더할시 ?가 나오도록
            }
        }
        temp += 65; //알파벳 배열의 인덱스값 +65 가 아스키 번호
        ans = (char)temp;//아스키 > 알파벳
        System.out.println(ans); //출력
    }
}
