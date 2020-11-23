package Uri._4_October;

import java.util.Scanner;

public class Uri_1131_Grenais {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score1, score2, position = 0;
        int totalMatch = 0, interTeam = 0, gremioTeam = 0, draw = 0;

        do {
            score1 = sc.nextInt();
            score2 = sc.nextInt();
            System.out.println("Novo grenal (1-sim 2-nao)");
            if (score1 > score2) {
                interTeam++;
            }else if (score1 < score2){
                gremioTeam++;
            }else {
                draw++;
            }
            position = sc.nextInt();
        } while (position != 2);

        System.out.println(totalMatch+" grenais");
        System.out.println("Inter:"+interTeam);
        System.out.println("Gremio:"+gremioTeam);
        System.out.println("Empates:"+draw);

        if (interTeam > gremioTeam){
            System.out.println("Inter venceu mais");
        }else if (interTeam < gremioTeam){
            System.out.println("Gremio venceu mais");
        }else {
            System.out.println("Não houve vencedor");
        }

/*
        while (true) {
            score1 = sc.nextInt();
            score2 = sc.nextInt();
            System.out.println("Novo grenal (1-sim 2-nao)");
            totalMatch++;
            if (score1 > score2) {
                interTeam++;
            } else if (score1 < score2) {
                gremioTeam++;
            } else {
                draw++;
            }

            position = sc.nextInt();
            if (position == 2) {
                break;
            }


        }

        System.out.println(totalMatch+" grenais");
        System.out.println("Inter:"+interTeam);
        System.out.println("Gremio:"+gremioTeam);
        System.out.println("Empates:"+draw);

        if (interTeam > gremioTeam){
            System.out.println("Inter venceu mais");
        }else if (interTeam < gremioTeam){
            System.out.println("Gremio venceu mais");
        }else {
            System.out.println("Não houve vencedor");
        }*/

    }
}
