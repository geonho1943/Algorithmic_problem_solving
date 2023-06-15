삼각수를의 규칙을 찾아 배열에 저장하고<br>
그 배열을 이용해 문제의 숫자가 가우스의 삼각수 법칙에 해당 되는지 알아내는 문제다<br>
가우스의 삼각수법칙은 삼각수 3개 이하의 합으로 모든 자연수를 증명할수 있다는것이다<br>

여기서 삼각수 3개의 합과 숫자가 일치 하는지 찾을때<br>
모든 경우를 다 더해서 숫자가 겹치는지 찾기때문에 완전탐색 유형이다<br>

문제에서는 3가지를 모두 더했을때만 요구하기때문에<br>

~~~
    private static int checkNum(int K){
        //K가 3개의 삼각수 합과 같을때 1을 출력한다
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                for (int k = 1; k < arr.length; k++) {
                    if (K == arr[i]+arr[j]+arr[k]){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
~~~

3중 for문으로 완전탐색을 구현 했다

> +arr배열의 인덱스0 의 경우엔<br>
> 값이 0 이기때문에 for을 1부터 시작 해야 한다
