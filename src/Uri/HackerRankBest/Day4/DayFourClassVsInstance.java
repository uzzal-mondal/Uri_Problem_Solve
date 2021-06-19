package Uri.HackerRankBest.Day4;

import java.util.Scanner;

public class DayFourClassVsInstance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputTestNum = sc.nextInt();
        for (int i = 0; i < inputTestNum; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}

