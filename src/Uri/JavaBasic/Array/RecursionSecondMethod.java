package Uri.JavaBasic.Array;

public class RecursionSecondMethod {
    public static void main(String[] args) {

        int result = sum(5, 10);
        System.out.println(result);
    }
    public static int sum(int start, int end) {
        if (end > start) {
            return  end + sum(start, end - 1);
        } else {
            return end;
        }
    }

    /*public static int sum(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum + sum(firstNum, secondNum - 1);
        } else {
            return secondNum;
        }
    }*/


}
