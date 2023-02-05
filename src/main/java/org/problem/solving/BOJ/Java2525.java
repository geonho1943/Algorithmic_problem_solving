package org.problem.solving.BOJ;

import java.util.Scanner;

public class Java2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String startTime = scanner.nextLine();
        int cookingTime = scanner.nextInt();

        int s = startTime.indexOf(" ");
        scanner.close();
        int startHour = Integer.parseInt(startTime.substring(0, s));
        int startMinute = Integer.parseInt(startTime.substring(s+1));

        int minuteTime = startMinute + cookingTime;

        int endHour = startHour + (minuteTime / 60);
        int endMinute = (minuteTime % 60);

        if (endHour >= 24) {
            endHour = endHour % 24;
        }
        System.out.printf(endHour + " " + endMinute);
    }
}