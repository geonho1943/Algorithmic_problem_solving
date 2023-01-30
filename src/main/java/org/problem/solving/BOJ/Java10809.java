package org.problem.solving.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java10809 {
    //알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서
    // 단어에 포함되어 있는 경우에는 처음 등장하는 위치를
    // 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
    //
    //입력
    //첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
    //
    //출력
    //각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
    //
    //만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
    //  예제 b a e k j o o n    baekjoon
    //~.    0 1 2 3 4 5 6 7
    //  1 0 -1 -1 2 -1 -1 -1 -1 4 -1 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1


    //abcd 하나씩 차래대로 단어에 대입하여 해당 알파벳이 몇번째에 있는지 세는것이 아니라
    //단어에 나온 알파벳을 순서대로 abcd배열에 있는 해당 알파벳 자리에 넣어주는것
    //* 착각한것
    // 알파벳들의 아스키값 끼리 뺀값을 응용 하는것이 아니라
    // 해당 아스키값 -a(97) 을 할경우 그값을 알파벳 "arr의 주소"로 이용할수 있는것이다

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();//단어 받기
        br.close();
        int arr[] = new int[26]; //알파벳 어레이

        for (int i=0; i<26;i++) { //알파벳 베열 -1로 세팅하기
            arr[i] = -1;
        }

        for (int i=0; i<S.length();i++){ //받은 단어를 하나씩 알파벳어레이에 조져줄생각 ㅇㅇ
            char Snum = S.charAt(i); //받은 단어를 하나씩 Snum 에 넣어주기 a s d
            if (arr[Snum- 'a']== -1) {
                arr[Snum - 'a'] = i; //알파벳 어레이의 인덱스 자리에
            }
        }
        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
