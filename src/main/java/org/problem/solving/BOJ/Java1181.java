package org.problem.solving.BOJ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//Arrays.sort를 써보라고 내준 문제 같다 길이순 정렬 + 사전순 정렬
// 중복 처리를 추가 해주면 된다

public class Java1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        //sc.nextLine();로 /n 버려주기 대신 parseInt 씀
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextLine();
        }
        sc.close();
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) return o1.compareTo(o2);
                else return o1.length() - o2.length();
            }
        });

        System.out.println(arr[0]);
        for (int i = 1; i < n; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                System.out.println(arr[i]);
            }
        }

    }
}
