package org.problem.solving.BOJ.Java7662;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Java7662_2 {
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
                    priQueue.add(n);
                    maxPriQueue.add(n);
                    map.put(n, map.getOrDefault(n, 0)+1);
                }else { // D
                    if(n == -1) delete(priQueue, map);
                    else if (n == 1) delete(maxPriQueue, map);
                }
            }
            if (map.isEmpty()){
                System.out.println("EMPTY");
            }else {
                int maxAns = delete(maxPriQueue, map);
                System.out.println(maxAns+" "+(!map.isEmpty() ? delete(priQueue, map): maxAns));
            }

        }
    }

    private static int delete(PriorityQueue<Integer> queue, HashMap<Integer, Integer> map) {
        while (!queue.isEmpty()) {
            int ans = queue.poll();
            int temp = map.getOrDefault(ans, 0);
            if (temp > 1) {
                map.put(ans, map.getOrDefault(ans,0)-1);
                return ans;
            } else if (temp == 1){
                map.remove(ans);
                return ans;
            }
        }
        return 0;
    }
}