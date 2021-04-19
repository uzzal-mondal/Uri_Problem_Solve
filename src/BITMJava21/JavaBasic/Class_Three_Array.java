package BITMJava21.JavaBasic;

import java.security.SecureRandom;

public class Class_Three_Array {
    public static void main(String[] args) {

        /*// using for loop, we can modify.
        int[] arrayOfNum = new int[10];
        for (int i = 0; i < arrayOfNum.length; i++) {
            arrayOfNum[i] = i + 1;
            System.out.printf("Array [%d] = %d\n", i, arrayOfNum[i]);
        }*/

        SecureRandom random = new SecureRandom();
        int randomNumber = 1 + random.nextInt(100);
        System.out.println(randomNumber);
        int[][] arrayOfNum = new int[3][3];



        /*//enhanced for loop
        String[] s = {"Dhaka", "Khulna", "Jessore", "Tangail"};

        for (String city : s) {
            for (int i = 0; i < city.length(); i++) {
                System.out.printf("Array[%d] = %s\n", i, city);
            }
        }*/
    }
}
