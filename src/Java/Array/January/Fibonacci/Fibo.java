package Java.Array.Fibonacci;

public class Fibo {
    public static void main(String[] args) {
        int[] arrayOfNum = new int[10];
        int i;

        arrayOfNum[0] = 0;
        arrayOfNum[1] = 1;

        /*System.out.println(arrayOfNum[0]);
        System.out.println(arrayOfNum[1]);*/

        for (i = 0; i < arrayOfNum.length; i++) {
            //arrayOfNum[i] = arrayOfNum[i - 2];
            if (i > 1) {
                arrayOfNum[i] = arrayOfNum[i - 2] + arrayOfNum[i - 1];
                System.out.printf("index[%d] =  %d\n", i, arrayOfNum[i]);
            } else {
                System.out.printf("index[%d]  = %d\n", i, arrayOfNum[i]);
            }


        }
    }
}
