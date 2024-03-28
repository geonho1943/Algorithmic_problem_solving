package programmers.lessons258712;

import java.util.Objects;

public class Lessons258712 {
    public static void main(String[] args) {
//    String[] friends = {"muzi", "ryan", "frodo", "neo"};
//    String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        String[] friends = new String[]{"joy", "brad", "alessandro", "conan", "david"};
        String[] gifts = new String[]{"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
    System.out.println(solution(friends, gifts));
    }
    public static int solution(String[] friends, String[] gifts) {
        String[][] giveAndTake = new String[friends.length][4];
        for (int i = 0; i < friends.length; i++) {
            giveAndTake[i][0] = friends[i];//이름
            giveAndTake[i][1] = "0";//선물 준 횟수
            giveAndTake[i][2] = "0";//선물 받은 횟수
            giveAndTake[i][3] = "0";//선물 지수
        }
        for (int i = 0; i < gifts.length; i++) {
            String temp[] = gifts[i].split(" ");
            for (int j = 0; j < friends.length; j++) {
                if (Objects.equals(temp[0], giveAndTake[j][0])) {
                    int sum = Integer.parseInt(giveAndTake[j][1]);
                    giveAndTake[j][1] = String.valueOf(sum + 1);
                }
                if (Objects.equals(temp[1], giveAndTake[j][0])) {
                    int sum = Integer.parseInt(giveAndTake[j][2]);
                    giveAndTake[j][2] = String.valueOf(sum + 1);
                }
            }
        }
        for (int i = 0; i < friends.length; i++) {
            //선물지수 생성
            giveAndTake[i][3] = String.valueOf(
                    Integer.parseInt(giveAndTake[i][1]) - Integer.parseInt(giveAndTake[i][2])
            );
        }
        int maxGifts = Integer.MIN_VALUE;
        for (int i = 0; i < friends.length; i++) {
            // 선물지수 생성
            giveAndTake[i][3] = String.valueOf(Integer.parseInt(giveAndTake[i][1]) - Integer.parseInt(giveAndTake[i][2]));
            // 가장 많은 선물을 받을 친구의 선물 수 계산
            int receivedGifts = calculateReceivedGifts(giveAndTake, i);
            if (receivedGifts > maxGifts) {
                maxGifts = receivedGifts;
            }
        }
        return maxGifts;
    }

    private static int calculateReceivedGifts(String[][] giveAndTake, int index) {
        int receivedGifts = 0;
        for (int i = 0; i < giveAndTake.length; i++) {
            if (i != index) {
                int giveToIndex = Integer.parseInt(giveAndTake[i][1]);
                int takeFromIndex = Integer.parseInt(giveAndTake[i][2]);
                int giveToCurrent = Integer.parseInt(giveAndTake[index][1]);
                int takeFromCurrent = Integer.parseInt(giveAndTake[index][2]);

                // 주고받은 기록이 있는 경우
                if (giveToIndex > takeFromIndex) {
                    if (giveToCurrent > takeFromCurrent) {
                        receivedGifts++;
                    }
                }
                // 주고받은 기록이 없거나 주고받은 수가 같은 경우
                else if (giveToIndex == takeFromIndex) {
                    if (Integer.parseInt(giveAndTake[index][3]) > 0) {
                        receivedGifts++;
                    }
                }
            }
        }
        return receivedGifts;
    }
}