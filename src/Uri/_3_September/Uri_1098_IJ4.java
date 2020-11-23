package Uri._3_September;

public class Uri_1098_IJ4 {
    public static void main(String[] args) {

        int i = 0, p = 0, q = 0, j = 0;
        for (i = 0; i <= 20; i += 2) {
            for (j = 1; j <= 3; j++) {
                if (i % 10 == 0) {
                    p = i / 10;
                    System.out.printf("I=%d J=%d\n", p, p + j);
                } else {
                    p = i / 10;
                    q = i % 10;
                    System.out.printf("I=%d.%d J=%d.%d\n", p, q, p + j, q);

                }
            }


            // System.out.printf("%d.%d\n", p, q);
        }












        /*int i = 0, p = 0, q = 0, j = 1;
        for (i = 0; i <= 20; i += 2) {
            for (j = 1; j <= 3; j++){
                if (i % 10 == 0) {
                    p = i / 10;
                    System.out.printf("I=%d J=%d\n",p, p+j);
                } else if(i % 10 != 0) {
                    p = i / 10;
                    q = i % 10;
                    System.out.printf("I=%d.%d J=%d.%d\n", p, q, p+j, q);
                }
            }
            //System.out.printf("%d = %d.%d\n", i, p, q);
        }*/








        /*int i = 0, p = 0, q = 0, j = 0;
        for (i = 0; i <= 20; i += 2) {
            for (j = 1; j <= 3; j += 1) {
                if (i % 10 == 0) {
                    p = i / 10;
                    System.out.printf("I=%d  J=%d\n", p, p + j);
                } else {
                    p = i / 10;
                    q = i % 10;
                    System.out.printf("I=%d.%d  J=%d.%d\n", p, q, p + j, p);
                }
            }
            //System.out.printf("%d = %d.%d \n", i, p, q);
        }
*/
    }
}
