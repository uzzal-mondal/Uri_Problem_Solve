package Java.Array.Fibonacci;

public class FibonacciSeriesArray {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 21 34 55
        //fNum + sNUm = fibo.
        int[] arrayOfNum = new int[15];

        arrayOfNum[0] = 0;
        arrayOfNum[1] = 1;

        for (int i = 2; i < arrayOfNum.length; i++) {
            arrayOfNum[i] = arrayOfNum[i-2];
            System.out.printf("index = [%d] , %d\n", i, arrayOfNum[i]);
            arrayOfNum[i] = arrayOfNum[i - 2] + arrayOfNum[i - 1];

        }


    }
}
