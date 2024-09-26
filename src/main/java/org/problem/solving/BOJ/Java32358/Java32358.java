package org.problem.solving.BOJ.Java32358;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Java32358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        TreeSet<Integer> treeS = new TreeSet<>();
        long sum = 0;
        int nowLocation = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            if (Integer.parseInt(st.nextToken())==1){
                treeS.add(Integer.parseInt(st.nextToken()));
            }else {
                while(!treeS.isEmpty()){
                    Integer l = treeS.floor(nowLocation);
                    Integer r = treeS.ceiling(nowLocation);
                    int nextLocation;
                    if (l == null) {
                        nextLocation = r;
                    } else if (r == null) {
                        nextLocation = l;
                    } else {
                        int distanceLeft = Math.abs(nowLocation - l);
                        int distanceRight = Math.abs(nowLocation - r);
                        if (distanceLeft <= distanceRight) {
                            nextLocation = l;
                        } else {
                            nextLocation = r;
                        }
                    }
                    sum += Math.abs(nowLocation - nextLocation);
                    nowLocation = nextLocation;
                    treeS.remove(nextLocation);
                }
            }
        }
        System.out.println(sum);
    }
}