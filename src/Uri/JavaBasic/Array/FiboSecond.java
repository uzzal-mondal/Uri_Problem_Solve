package Uri.JavaBasic.Array;


public class FiboSecond {
    public static void main(String[] args) {

        final int ARRAY_LENGTH = 10;
        int[] arrayOfNum = new int[ARRAY_LENGTH];

        for (int i = 0; i < arrayOfNum.length; i++) {
            //todo: this fib is function..
            arrayOfNum[i] = fib(i);
        }
        System.out.println("Index\tValue");
        for (int i = 0; i < arrayOfNum.length; i++) {
            System.out.println(i + "\t" + arrayOfNum[i]);
        }
    }

    private static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
