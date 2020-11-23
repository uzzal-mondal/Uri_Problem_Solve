package Uri._1_July;

import java.util.Scanner;

public class URI_1009_SalaryBonus {
    public static void main(String[] args) {


        String sellers_name;
        double fixed_salary, sellers_month_salary, total_salary;

        Scanner sc = new Scanner(System.in);
        sellers_name = sc.nextLine();
        fixed_salary = sc.nextDouble();
        sellers_month_salary = sc.nextDouble();

        total_salary = fixed_salary + (sellers_month_salary * 15 / 100);

        System.out.printf("TOTAL = R$ %.2f\n", total_salary);

       /* String name;
        double fixedSalary, totalSale, totalEarn;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your seller name: ");
        name = sc.nextLine();
        System.out.println("Enter your fixed salary: ");
        fixedSalary = sc.nextDouble();
        System.out.println("Total sale: ");
        totalSale = sc.nextDouble();

        System.out.println("Name : "+name);
        totalEarn = fixedSalary + totalSale * 15/100;
        System.out.printf("SALARY = R$ %.2f",totalEarn);*/

    }
}
