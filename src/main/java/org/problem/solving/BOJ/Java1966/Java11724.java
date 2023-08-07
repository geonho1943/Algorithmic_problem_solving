package org.problem.solving.BOJ.Java1966;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Java11724 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        while (TC-- > 0){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            LinkedList<int[]> docuLevel = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                docuLevel.offer(new int[]{i, Integer.parseInt(st.nextToken())});
            }
            // 입력 완료
            int count=0;

            while (!docuLevel.isEmpty()){
                int[] cDoc = docuLevel.poll(); //비교할 문서의 요소를 배열로 보유
                boolean bigLevel = true;

                for (int[] doc : docuLevel) {//doc 과 cDoc을 순회하며 비교후 t/f 저장
                    if (cDoc[1] < doc[1]) {
                        bigLevel = false;
                        break;
                    }
                }

                if (!bigLevel){// 가장 크지않으면 큐의 맨뒤에 저장
                    docuLevel.offer(cDoc);
                }else {// 가장큰수면 출력 대신 카운트++
                    count++;
                    if (M == cDoc[0]){ //카운트 요소가 목표인 M 일경우해당 카운트값 출력
                        System.out.println(count);
                        break;
                    }
                }
            }

        }
    }
}
