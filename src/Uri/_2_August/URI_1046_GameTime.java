package Uri._2_August;

import java.util.Scanner;

public class URI_1046_GameTime {
    public static void main(String[] args) {
        int startTime, endTime, dt, md = 24;
        Scanner sc = new Scanner(System.in);
        startTime = sc.nextInt();
        endTime = sc.nextInt();

        if (endTime == startTime) {
            int tr = endTime - startTime;
            System.out.println("O JOGO DUROU"+ tr +"HORA(S)");
        } else if (endTime > startTime){
            dt = endTime - startTime;
            System.out.println("O JOGO DUROU"+ dt +"HORA(S)");
        }else if (startTime > endTime){
               endTime = endTime += md;
               int tt = endTime - startTime;
            System.out.println("O JOGO DUROU"+ 10 +"HORA(S)");

        }
    }
}
