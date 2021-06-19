package Uri.HackerRankBest.ClassVsInstance;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputTest = sc.nextInt();
        System.out.println("Input num : " + inputTest);
        for (int i = 0; i < inputTest; i++) {
            int age = sc.nextInt();
            System.out.println("AGE: " + age);
            Person p = new Person(age); // age passing the argument initialAge;
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
                System.out.println(j);
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
