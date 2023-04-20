```
모든 경우를 순차 대입 하다가
각배열의i,j인덱스의 저장된 값이 일치하는순간
해당하는 값은 true,sb에 1 을 저장
반복문이 끝나면 sb를 출력 했다

하지만 시간 초과가 걸렸고
이분 탐색을 통해 풀었다
```
```

하지만 또 시간 초과가 걸렸고 버퍼리더를 사용했다
알고리즘의 차이는 없고 입출력방식의 변경만으로
통과가 되고 안되고는 의미가 없다고
스캐너를 써도 통과가 되어야
의도한 방식으로 풀었다고 생각한다
 
하지만 한두번도 아니고..
백준 클래스가 높아 질수록 점점 버퍼리더먼저 사용해야 할지도 모르겠다
 
```

이분탐색 전
~~~
public class Java1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] arr1 = new int[sc.nextInt()];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[sc.nextInt()];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        boolean ans;

        for (int i = 0; i < arr2.length; i++) {
            ans=false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i]==arr1[j]){
                    ans=true;
                    break;
                }
            }
            if (ans) sb.append(1+"\n");
            else sb.append(0+"\n");
        }
        System.out.println(sb);
    }
}
~~~
이분 탐색 후
~~~
public class Java1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());
            int lo = 0;
            int hi = N - 1;
            boolean ans = false;

            while (lo <= hi) {
                int mid = (lo + hi) / 2;
                if (key < arr[mid]) {
                    hi = mid - 1;
                } else if (key > arr[mid]) {
                    lo = mid + 1;
                } else {
                    ans = true;
                    break;
                }
            }
            if (ans) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }
}
~~~

