package Uri._1_July;

import java.util.Scanner;

public class URI_1008_Salary {
    public static void main(String[] args) {

        int employee_Num, work_Hour;
        double salary_per_hour, total_salary;

        Scanner sc = new Scanner(System.in);
        employee_Num = sc.nextInt();
        work_Hour = sc.nextInt();
        salary_per_hour = sc.nextDouble();

        total_salary = work_Hour * salary_per_hour;
        System.out.println("NUMBER = "+employee_Num);
        System.out.printf("SALARY = U$ %.2f\n",total_salary);










        /*int num, work_hour;
        double salary_per_hour, total_salary;

        Scanner sc = new Scanner(System.in);
        System.out.println("Employee num: ");
        num = sc.nextInt();
        System.out.println("Work hour : ");
        work_hour = sc.nextInt();
        System.out.println("Salary Per Hour: ");
        salary_per_hour = sc.nextDouble();

        total_salary = work_hour * salary_per_hour;
        System.out.println("NUMBER = "+num);
        System.out.printf("SALARY = U$ %.2f",total_salary);

        System.out.println();
        double onMan = total_salary / num;
        System.out.println("A man $U "+onMan);*/

    }
}
