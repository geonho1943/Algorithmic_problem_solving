package org.problem.solving.BOJ.Java1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Java1931LinkedList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        LinkedList<int[]> schedule = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startTime = Integer.parseInt(st.nextToken());
            int endTime = Integer.parseInt(st.nextToken());
            int[] meeting ={startTime, endTime};
            schedule.add(meeting);
        }
        Collections.sort(schedule, (m1, m2) -> {
            if (m1[1] == m2[1]) {
                return Integer.compare(m1[0], m2[0]);
            }
            return Integer.compare(m1[1], m2[1]);
        });

        int maxMeetings = 0;
        int lastEndTime = 0;

        for (int[] meeting : schedule) {
            int startTime = meeting[0];
            int endTime = meeting[1];

            if (startTime >= lastEndTime) {
                maxMeetings++;
                lastEndTime = endTime;
            }
        }

        System.out.println(maxMeetings);
    }
}
