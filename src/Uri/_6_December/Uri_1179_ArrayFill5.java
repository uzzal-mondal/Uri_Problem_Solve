package Uri._6_December;

import java.util.Scanner;

public class Uri_1179_ArrayFill5 {
    public static void main(String[] args) {

        int num, i, j;
        int[] par = new int[5];
        int[] imPar = new int[5];
        int indexOne = 0, indexTwo = 0;
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 15; i++) {
            num = sc.nextInt();
            // comment todo: even or odd num find & save the array  ..............:
            if (num % 2 == 0) {
                par[indexOne] = num;
                indexOne++;
            } else {
                imPar[indexTwo] = num;
                indexTwo++;
            }

            //comment todo: array fill cup codding print area ............:
            if (indexOne == 5) {
                for (j = 0; j < par.length; j++) {
                    System.out.printf("par[%d] = %d\n", j, par[j]);
                    indexOne = 0;
                }

            }

            if (indexTwo == 5) {
                for (j = 0; j < imPar.length; j++) {
                    System.out.printf("impar[%d] = %d\n", j, imPar[j]);
                    indexTwo = 0;
                }

            }
        }


        //comment todo: remaining the odd array .....:)
        for (j = 0; j < indexTwo; j++) {
            System.out.printf("impar[%d] = %d\n", j, imPar[j]);
        }

        for (j = 0; j < indexOne; j++) {
            System.out.printf("par[%d] = %d\n", j, par[j]);
        }












       /* int num;
        int[] par = new int[5];
        int[] impar = new int[5];
        int indexOne = 0, indexTwo = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 15; i++) {
            num = sc.nextInt();
            if (num % 2 == 0) {
                par[indexOne] = num;
                indexOne++;
                //System.out.println(par[indexOne]);
            } else {
                impar[indexTwo] = num;
                indexTwo++;
                //System.out.println(impar[indexTwo]);
            }

            //comment todo : array fill up code..:
            if (indexOne == 5) {
                for (int j = 0; j < par.length; j++) {
                    System.out.printf("par[%d] = %d\n", j, par[j]);
                    indexOne = 0;
                }
            }
            if (indexTwo == 5) {
                for (int j = 0; j < impar.length; j++) {
                    System.out.printf("impar[%d] = %d\n", j, impar[j]);
                    indexTwo = 0;
                }
            }
        }


         //comment todo: reminder array codding ..:
        for (int j = 0; j < indexTwo; j++) {
            System.out.printf("impar[%d] = %d\n", j, impar[j]);
        }

        for (int j = 0; j < indexOne; j++) {
            System.out.printf("par[%d] = %d\n", j, par[j]);
        }*/









       /* int num, l = 0, k = 0;
        int[] par = new int[5];
        int[] imPar = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 15; i++) {
            num = sc.nextInt();
            if (num % 2 == 0) {
                par[l] = num;
                l++;

                //comment todo: array fill up
                if (l == 5) {
                    for (int m = 0; m < par.length; m++) {
                        System.out.printf("par[%d] = %d\n", m, par[i]);
                        par[m] = 0;
                    }
                    l = 0;
                }

            } else {
                imPar[k] = num;
                k++;
                if (k == 5) {
                    for (int n = 0; n < imPar.length; n++) {
                        System.out.printf("impar[%d] = %d\n", n, imPar[i]);
                        imPar[n] = 0;
                    }
                    k = 0;
                }
            }


        }

        //comment todo:reminder array printout

        for (int i = 0; i < imPar.length; i++) {
            if (imPar[i] == 0) {
                break;
            } else {
                System.out.printf("impar[%d] = %d\n", i, imPar[i]);
            }
        }

        for (int i = 0; i < par.length; i++) {
            if (par[i] == 0) {
                break;
            } else {
                System.out.printf("par[%d] = %d\n", i, par[i]);
            }
        }

*/


    }
}
