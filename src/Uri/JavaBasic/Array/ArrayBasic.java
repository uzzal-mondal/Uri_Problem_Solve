package Uri.JavaBasic.Array;

import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args) {

        int[] arrayOfNum = new int[10];
        int count = 0;
        Scanner sc = new Scanner(System.in);

        // array initialize.
        System.out.print("Index " + "\t" + "Value"+"\n");
        for (int i = 0; i < arrayOfNum.length; i++) {
            arrayOfNum[i] = sc.nextInt();
            System.out.print(i + "\t\t" + arrayOfNum[i] + "\n");

        }

        // array print..
        System.out.printf("Element " + "\t" + "Value: "+"\n");
        for (int i = 0; i < arrayOfNum.length; i++) {
            count++;
            System.out.print(count + "\t\t\t" + arrayOfNum[i] + "\n");
        }

    }
}
