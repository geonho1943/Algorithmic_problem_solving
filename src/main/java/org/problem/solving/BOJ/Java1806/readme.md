1806 투포인터 사용 문제

주워지는 배열의 '연속된 구간 하나의 합'이 S 이상 일때 의 최소 구간길이 를 구하는 문제

문제를 딱 읽었을때는 투포인터를 사용해 특정 구간을 변경해 나가며
그것이 요구사항에 맞을때 답을 출력해야겠다고 생각했다

하지만 그 구간을 특정하는 방법이 헛점이 있었다

첫번째 구현 방법
시작, 끝 피벗을 배열 양끝에 놓는다
양쪽을 한번씩 줄여 나가는데 그 기준은 더 작은값을 구간에서 제외 한다
요구사항을 체크하며 구간합 길이를 줄여 나가길 반복하면
배열의 가장 큰값이 포함된 구간이 남게되고 그 길이를 반환 한다

문제에서 요구하는 'S이상의 구간을 만들지못할때 0을 출력하라'의 경우
맨처음 배열의 양끝을 피벗으로 설정할 때 그 총합이 S 이상이지 못할때 인데
처음부터 배열의 총합을 가지고 연산하기때문에
이 예외를 처리하기 매우 쉬웠다
하지만 이 방법의 경우 구간에 최댓값이 포함 되지않는 경우 를 측정할 수 없었다
예를 들어 tc:
4 12
10 1 9 9 의 경우
최댓값 10을 무조건 포함하게 되는데
걸과는 (10 1 9) 3 이지만
실제 정답은 (9 9) 2 이다

두번째 방법은
시작, 끝을 0에서 시작하고
부분합이 S가 될때까지 는 구간의 앞 길이를 늘리고
S이상 일 경우 뒤에서 구간을 줄이며 요구사항, 최소길이를 체크 한다

이 방법도 한번에 통과하지 못했는데
구간을 늘리는 연산이 배열의 끝에 다다랐을때
연산을 끝네는것이 아니라 S이상을 만족 할 때까지
구간의 뒤를 줄여 최소 길이를 갱신 해야 했다
그것을 하지못해
tc:
6 12
1 6 6 1 1 10 의 경우
(6 6 1 1 10) 5 라는 결과가 나왔다
실제 답: (1 1 10) 3

수정해서 통과 했다
1주일간 문제를 풀지않아서 일까
투포인터 개념은 쉽지만 응용하기 쉽지않은 전략인것 같다
소요시간: 2시간 반