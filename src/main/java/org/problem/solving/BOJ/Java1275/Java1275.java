package org.problem.solving.BOJ.Java1275;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java1275 {
    static long[] segmentArr;
    static long[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        arr = new long[N+1];
        segmentArr = new long[N*4];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        setSegment(1,N, 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (x > y) {
                int temp = x;
                x = y;
                y = temp;
            }
            sb.append(getPrefixSum(1, N, 1, x, y)+"\n");
            update(1, N, 1, a, b);
        }
        System.out.println(sb);
    }
    private static void setSegment(int start, int end, int idx) {
        // 세그먼트 트리의 최초 생성
        if (start == end) segmentArr[idx] = arr[start];
        else {
            int mid = (start+end)/2;
            setSegment(start, mid, idx*2);
            setSegment(mid+1, end, idx*2+1);
            segmentArr[idx] = segmentArr[idx*2] + segmentArr[idx*2+1];
        }
    }
    private static long getPrefixSum(int start, int end, int idx, int x, int y ) {
        // 세그먼트 트리를 이용한 구간 합 반환
        if (x > end || y < start) return 0;
        if (x <= start && end <= y){
            return segmentArr[idx];
        }
        int mid = (start+end)/2;
        long leftSum = getPrefixSum(start, mid, idx*2, x, y);
        long rightSum = getPrefixSum(mid+1, end, idx*2+1, x, y);
        return leftSum+rightSum;
    }
    private static void update(int start, int end, int idx, int goleIdx, long newInt) {
        if (start == end) {
            segmentArr[idx] = newInt; // 리프 노드에서 세그먼트 트리 갱신
        } else {
            int mid = (start + end) / 2;
            if (goleIdx <= mid) {
                update(start, mid, idx * 2, goleIdx, newInt); // 왼쪽 자식 갱신
            } else {
                update(mid + 1, end, idx * 2 + 1, goleIdx, newInt); // 오른쪽 자식 갱신
            }
            segmentArr[idx] = segmentArr[idx * 2] + segmentArr[idx * 2 + 1]; // 부모 노드 갱신
        }
    }
}