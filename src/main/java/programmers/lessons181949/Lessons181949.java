package programmers.lessons181949;

import java.util.LinkedList;
import java.util.Scanner;

public class Lessons181949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < a.length(); i++) {
            list.add(a.charAt(i));
        }
        for (Character character : list) {
            if (Character.isUpperCase(character)) {
                System.out.print(Character.toLowerCase(character));
            } else {
                System.out.print(Character.toUpperCase(character));
            }
        }
    }
}
