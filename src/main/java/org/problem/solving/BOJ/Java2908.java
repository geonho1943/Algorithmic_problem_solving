package org.problem.solving.BOJ;

//상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다.
// 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다.
// 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
//
//상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어,
// 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다.
// 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
//
//두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
//
//입력
// 첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
//출력
//첫째 줄에 상수의 대답을 출력한다.
//012_456
//734 893   437
//221 231   132
//839 237   938

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num1 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int num2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        br.close();
        if (num1<num2){
            System.out.println(num2);
        }else{
            System.out.println(num1);
        }
    }
}
//입력받은 값을 뒤집어서 비교후 출력하는 간단한 문제지만
//뒤집는방법이 다양해서 이것저것 시도할수 있어서 재미있다
// 마음에드는 방법은 substring()으로 하나하나뽑아서 비교후
// 바로 출력하는 인덱스를 사용하는것

//신기한 방법은 System.in.input으로 에초에 한글자씩 할당 받도록 하는것
//이것이 가장 간단하지만 입력받는시간이 효율적이지못해서 시간이 오래걸리는 방법이다

//이것저것하다가 타입 변환과정이 간단할수있는 로직을 복잡하게 만들어서 reverse로 때웠다
//나중에 변수를 하나만 쓴다거나 하나의기능으로 문제를 해결한다거나 다시 풀어볼 예정