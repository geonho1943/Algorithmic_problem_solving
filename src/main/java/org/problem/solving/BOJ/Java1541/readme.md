이 문제는 +,- 를 기준으로 나누어<br>
 "+" 연산을 먼저 해주고<br>
"-" 연산을 하면 가장 작은수로 만들수 있는 규칙을 사용하는 문제다<br>
인터넷에선 굳이 알고리즘유형을 구분하지는 않있지만
이 문제는 철저하게 + 연산먼저 해주고 + 연산이 끝나면 -연산을 해주기때문에
그리디라고 생각했다 각단계라고 할수 있는게 +,- 둘뿐이라 그리디라고 할수 없다면 구현 문제일 것이다

풀이 방식은 StringTokenizer 를 이용해 "-"를 기준으로 분리해주었고<br>
countTokens() 만큼 반복문들 돌렸다
분리된 문자열을 배열에 저장후<br>
배열의 인덱스 기준으로
"+" 기준으로 나눈 값을 더해 int배열 addArr에 저장 했다
배열 addArr이 다 구해졌다면 addArr의 종합을 출력해주도록 구현 했다