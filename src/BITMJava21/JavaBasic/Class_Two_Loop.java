package BITMJava21.JavaBasic;

public class Class_Two_Loop {
    public static void main(String[] args) {

        int i = 0;
        System.out.println("Even num");
        while (i < 10) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        int j = 0;
        System.out.println("Odd num");
        while (j < 10) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
            j++;
        }

        System.out.println("do while condition using..");
        int k = -1;
        do {
            if (k > 0) {
                System.out.println("Positive: " + k);
            } else if (k < 0) {
                System.out.println("Negative: " + k);
            } else {
                System.out.println("this is Zero: " + k);
            }
            k++;
        } while (k < 2);

    }
}
