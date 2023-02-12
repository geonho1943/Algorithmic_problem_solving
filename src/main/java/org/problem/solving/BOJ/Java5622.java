package org.problem.solving.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//상근이의 할머니는 아래 그림과 같이 오래된 다이얼 전화기를 사용한다.
//
//전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
//
//숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
//
//상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
//
//할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.
//
//출력
//첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.

//아스키로 풀든 배열로 풀든 전화기 다이얼에 알파벳 4개가 들어가는 숫자가 있어서 난해해 보이는 코드를쓸수밖에 없었다..
// + 입력 받은 문자의 번호가 아니라 입력 하는데 걸리는 초를 구하는것 이라는걸 착각하면 안됨
//그냥 물자열,배열 연습용 문제 같다
public class Java5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word =br.readLine();
        br.close();
        String[] arr =word.split("");
        int temp=0;
        for (int i=0;i<arr.length;i++){
            switch (arr[i]){
                case "A": case "B": case "C":
                    temp=temp+2;
                    break;
                case "D": case "E": case "F":
                    temp=temp+3;
                    break;
                case "G": case "H": case "I":
                    temp=temp+4;
                    break;
                case "J": case "K": case "L":
                    temp=temp+5;
                    break;
                case "M": case "N": case "O":
                    temp=temp+6;
                    break;
                case "P": case "Q": case "R": case "S":
                    temp=temp+7;
                    break;
                case "T": case "U": case "V":
                    temp=temp+8;
                    break;
                case "W": case "X": case "Y": case "Z":
                    temp=temp+9;
                    break;
            }
        }
        System.out.println(temp+ arr.length);
    }
}
