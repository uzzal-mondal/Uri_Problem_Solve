package Uri._2_August;

import java.util.Scanner;

public class URI_1049_Animal {
    public static void main(String[] args) {
        String a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        b = sc.nextLine();
        c = sc.nextLine();

        if (a.equals("vertebrado") && b.equals("ave") && c.equals("carnivoro")) {
            System.out.println("aguia");
        } else if (a.equals("vertebrado") && b.equals("ave") && c.equals("onivoro")) {
            System.out.println("pomba");
        } else if (a.equals("vertebrado") && b.equals("mamifero") && c.equals("onivoro")) {
            System.out.println("homen");
        } else if (a.equals("vertebrado") && b.equals("ave") && c.equals("herbivoro")) {
            System.out.println("vaca");
        } else if (a.equals("invertebrado") && b.equals("inseto") && c.equals("hematofago")) {
            System.out.println("pulga");
        } else if (a.equals("invertebrado") && b.equals("inseto") && c.equals("herbivoro")) {
            System.out.println("lagarta");
        } else if (a.equals("invertebrado") && b.equals("anelideo") && c.equals("hematofago")) {
            System.out.println("sanguessuga");
        } else if (a.equals("invertebrado") && b.equals("anelideo") && c.equals("onivoro")) {
            System.out.println("minhoca");
        }
    }
}
