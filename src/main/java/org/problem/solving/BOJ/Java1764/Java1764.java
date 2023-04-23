package org.problem.solving.BOJ.Java1764;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Java1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String,Integer> hash = new HashMap<>();
        for (int i = 0; i < N; i++) {
            hash.put(br.readLine(), 1);//해시맵에 이름 넣고 1로 초기화
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (hash.containsKey(name))ans.add(name);//비교하기
        }
        Collections.sort(ans);//사전순 정렬
        bw.write(ans.size()+"\n");
        for (int i = 0; i < ans.size(); i++) { //출력
            bw.write(ans.get(i));
            bw.newLine();
        }
        bw.flush();
    }
}
