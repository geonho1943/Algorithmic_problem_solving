package org.problem.solving.BOJ.Java10845;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Java10845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int back=0;
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < N; i++) {
            String com = sc.next();
            switch (com){
                case "push":
                    back = sc.nextInt();
                    queue.offer(back);
                    break;
                case "pop":
                    if (queue.isEmpty()) sb.append("-1"+"\n");
                        else sb.append(queue.poll()+"\n");
                    break;
                case "size":
                    sb.append(queue.size()+"\n");
                    break;
                case "empty":
                    if (queue.isEmpty())sb.append(1+"\n");
                    else sb.append(0+"\n");
                    break;
                case "front":
                    if (queue.isEmpty())sb.append(-1+"\n");
                    else sb.append(queue.peek()+"\n");
                    break;
                case "back":
                    if (queue.isEmpty())sb.append(-1+"\n");
                    else sb.append(back+"\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
