package org.problem.solving.BOJ.Java7662;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Java7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            HashMap<Integer, Integer> map = new HashMap<>();
            PriorityQueue<Integer> priQueue = new PriorityQueue<>();//기본적으로 오름차순이라 가장작은값 먼저 출력 함
            PriorityQueue<Integer> maxPriQueue = new PriorityQueue<>(Collections.reverseOrder());//큰값 우선순위 큐
            StringTokenizer st;
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                char di = st.nextToken().charAt(0);
                int n = Integer.parseInt(st.nextToken());
                if (di =='I'){
                    // n을 Q에 삽입
                    priQueue.add(n);
                    maxPriQueue.add(n);
                    map.put(n, map.getOrDefault(n, 0)+1);
                }else {// D
                    if(n == -1){
                        delete(priQueue, map);
                    } else if (n == 1) {
                        delete(maxPriQueue, map);
                    }
                }
            }
            if (map.isEmpty()){
                System.out.println("EMPTY");
            }else {
                int maxAns = delete(maxPriQueue, map);
//                int ans = delete(priQueue, map);
                System.out.println(maxAns+" "+(!map.isEmpty() ? delete(priQueue, map): maxAns));
            }

        }
    }

    private static int delete(PriorityQueue<Integer> queue, HashMap<Integer, Integer> map) {
        //큐에서 뽑은 값이 맵에 있다 > 맵에 그값이 0 일경우 최대,최소값 다시뽑기
        // 1일 경우 > 맵에서 삭제, 값 반환
        // 1 초과일 경우 > 맵의 값 -1, 값 반환
        int ans = 0;
        while (!queue.isEmpty()) {
            ans = queue.poll();
            int temp = map.getOrDefault(ans, 0);
            if (temp == 0) continue;
            if (temp > 1) {
                map.put(ans, map.getOrDefault(ans,0)-1);
            } else if (temp == 1){
                map.remove(ans);
            }
            break;
        }
        return ans;
    }
}