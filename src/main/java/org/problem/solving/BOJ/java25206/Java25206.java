package org.problem.solving.BOJ.java25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java25206 {
    static Double gradeSum = 0.0;
    static Double sum = 0.0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine()," ");
            st.nextToken();
            double grade = Double.parseDouble(st.nextToken());
            String subjectP = st.nextToken();

            switch (subjectP){
                case "A+" : gradeSum += grade*4.5;
                    sum += grade;
                    break;
                case "A0" : gradeSum += grade*4.0;
                    sum += grade;
                    break;
                case "B+" : gradeSum += grade*3.5;
                    sum += grade;
                    break;
                case "B0" : gradeSum += grade*3.0;
                    sum += grade;
                    break;
                case "C+" : gradeSum += grade*2.5;
                    sum += grade;
                    break;
                case "C0" : gradeSum += grade*2.0;
                    sum += grade;
                    break;
                case "D+" : gradeSum += grade*1.5;
                    sum += grade;
                    break;
                case "D0" : gradeSum += grade*1.0;
                    sum += grade;
                    break;
                case "F" : gradeSum += grade*0.0;
                    sum += grade;
                    break;
            }
        }
        System.out.println(gradeSum/sum);
    }
}
