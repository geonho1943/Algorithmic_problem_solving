package org.problem.solving.BOJ;

import java.util.Scanner;

public class Localtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String temp = sc.nextLine();
            if (temp != null){
                System.out.println(temp);
            }else{
                break;
            }
        }
    }
}
