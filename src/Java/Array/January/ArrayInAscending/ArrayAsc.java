package Java.Array.January.ArrayInAscending;
import java.util.Scanner;

public class ArrayAsc {
    public static void main(String[] args) {

        int[] arrayOfNum = new int[10];
        int testNum, i, j, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("how many data do you want to show..?");
        testNum = sc.nextInt();

        System.out.println("Array an elements data are: ");
        for (i = 0; i < testNum; i++) {
            arrayOfNum[i] = sc.nextInt();
            System.out.printf("index: %d = %d\n", i, arrayOfNum[i]);
        }

        System.out.println("Descending array are: ");
        for (i = 0; i < testNum; i++) {
            System.out.printf("%d ", arrayOfNum[i]);
        }

        System.out.println("\nArray of ascending array are: ");
        for (i = 0; i < testNum; i++) {
            for (j = i + 1; j < testNum; j++) {
                if (arrayOfNum[i] > arrayOfNum[j]) {
                    temp = arrayOfNum[i];
                    arrayOfNum[i] = arrayOfNum[j];
                    arrayOfNum[j] = temp;
                }
            }
        }
        for (i = 0; i < testNum; i++) {
            System.out.printf("%d ", arrayOfNum[i]);
        }
    }
}
