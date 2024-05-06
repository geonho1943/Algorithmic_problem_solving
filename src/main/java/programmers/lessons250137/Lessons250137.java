package programmers.lessons250137;

public class Lessons250137 {
    public static void main(String[] args) {
        int[] bandage = {5,1,5};
        int health = 30;
        int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
        System.out.println(solution(bandage, health, attacks));
    }
    public static int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int combo = 0;
        int time = 0;
        int attackIdx = 0;
        boolean isAttacked;

        // 마지막 공격 시간을 구합니다.
        int lastAttackTime = attacks[attacks.length - 1][0];

        while (time <= lastAttackTime) {
            // 현재 시간에 몬스터의 공격이 있는지 확인
            if (attackIdx < attacks.length && time == attacks[attackIdx][0]) {
                answer -= attacks[attackIdx][1];
                if (answer <= 0) return -1; // 체력이 0 이하이면 종료
                isAttacked = true;
                combo = 0;
                attackIdx++;
            } else {
                isAttacked = false;
            }

            // 공격 받지 않았을 때만 체력 회복
            if (!isAttacked) {
                if (answer < health) {
                    answer += bandage[1];
                    if (answer > health) answer = health;
                    combo++;
                }
                if (combo == bandage[0]) {
                    answer += bandage[2];
                    if (answer > health) answer = health;
                    combo = 0; // 연속 성공 계수 초기화
                }
            }
            time++;
        }

        return answer;
    }
}