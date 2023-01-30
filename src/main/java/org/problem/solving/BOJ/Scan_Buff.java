package org.problem.solving.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Scan_Buff {
    public static void sun() throws IOException {
        Scanner fsc = new Scanner(System.in);
        System.out.println("scanner or bufferReader? 0 or 1.");
        int c = fsc.nextInt();
        if (c ==0){
            ver_scnr();
        }else if(c==1){
            ver_br();
        }else {
            System.out.println("0 과 1 중 선택해주세요");
        }

    }
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
        int asd =1;
        while (asd ==1){
        sun();
            System.out.println("다시하려면1 아니면0");
            if (asd ==0){
                System.out.println("종료합니다");
                break;
            }
        }
    }


    public static void ver_scnr(){
        System.out.println("스케너 모드");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        int cnt = 0;

        for(int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        int v= sc.nextInt();

        for(int i = 0; i < array.length; i++) {
            if (v == array[i]){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
    public static void ver_br() throws IOException {
        System.out.println("버퍼리더 모드");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
            if (map.get(input) == null) {
                map.put(input, 1);
            } else {
                map.replace(input, map.get(input) + 1);
            }
        }

        int v = Integer.parseInt(br.readLine());
        if (map.get(v) == null)
            System.out.println(0);
        else
            System.out.println(map.get(v));
    }
}

