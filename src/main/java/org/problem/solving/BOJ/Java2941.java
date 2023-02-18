package org.problem.solving.BOJ;

import java.util.Scanner;

public class Java2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int num =0;
        for (int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'c': case 's': case 'z':
                    if (i+1<s.length()){
                        if (s.charAt(i+1)=='='){
                            i++;
                        } else if (s.charAt(i+1)=='-') {
                            i++;
                        }
                    }
                    num+=1;
                    break;
                case 'l': case 'n':
                    if (i+1<s.length()){
                        if (s.charAt(i+1)=='j'){
                            i++;
                        }
                    }
                    num+=1;
                    break;
                case 'd':
                    if (i+1<s.length()){
                        if (s.charAt(i+1)=='-'){
                            i++;
                        } else if (s.charAt(i+1)=='z'){
                            if (i+2<s.length()){
                                if (s.charAt(i+2)=='='){
                                    i+=2;
                                }
                            }
                        }
                    }
                    num+=1;
                    break;
                default:{num+=1;break;}
            }
        }
        System.out.println(num);
    }
}