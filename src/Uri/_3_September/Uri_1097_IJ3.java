package Uri._3_September;

public class Uri_1097_IJ3 {
    public static void main(String[] args) {

        /*int i, j, k = 7;

        for (i = 1; i <= 9; i += 2) {
            for (j = 1; j <= 3; j++) {
                System.out.println(i + " " + k);
                k--;

            }
            k += 5;
            System.out.println(i);
        }*/

        int i, j, k = 0;

        for (i = 1; i <= 9; i += 2, k += 2) {
            for (j = 7 + k; j >= 5 + k; j--) {
                System.out.println(i + " " + j);
            }
        }
    }
}
