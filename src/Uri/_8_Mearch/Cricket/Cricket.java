package Uri._8_Mearch.Cricket;

import java.util.Random;
import java.util.Scanner;

public class Cricket {
    public static void main(String[] args) {
        String player;
        String team_One, team_Two;
        int toss, choice, random_Ts, selectBatBowl;

        Scanner sc = new Scanner(System.in);
        System.out.println("The play start now Mirpur Stadium");
        System.out.println("Enter your first team name : ");
        team_One = sc.nextLine();
        System.out.println("Enter your second team name : ");
        team_Two = sc.nextLine();

        System.out.println("Choose the Head or Tail, Head select: 1, Tail select: 2");


        Random random = new Random();
        random_Ts = random.nextInt(2) + 1;


        while (true) {
            choice = sc.nextInt();
            if (choice == 1 || choice == 2) {
                //System.out.println("Choose the Head or Tail, Head press: 1, Tail press: 2");
                //toss = sc.nextInt();
                //  random_Ts = (int) (1 + (Math.random() % 2));
                // random_Ts = (int) Math.random();


                if (random_Ts == choice) {
                    System.out.println(team_One + "- won the toss, Enter your choice");
                    System.out.println("If you want BAT select: 1 " +
                            "or if you want BOL select: 2 ");
                    selectBatBowl = sc.nextInt();
                } else {
                    //System.out.println("Head is win the toss.");
                    System.out.println(team_Two + "- loose the toss," + team_One + "  Team elected to BAT First ");
                    selectBatBowl = 2;
                }

                if (selectBatBowl == 1) {
                    System.out.println(" : Batting.......");
                    //battingTeam();
                    // battingTeam();
                }
                if (selectBatBowl == 2) {
                    System.out.println(" : Balwing......");
                }
                break;
            } else {
                // System.out.println("you loose the toss, opponent Team elected to BAT First");
                System.out.println(choice + ": is your wrong key,  Choose the Head or Tail, Head select: 1, Tail select: 2");
            }
        }
    }


    public static void battingTeam() {
        int zeroRun = 0, oneRun = 1, twoRun = 2, threeRun = 3, fourRun = 4, sixRun = 6;
        String firstBatting, secondBatting;
        int over, i, fBattingRun, sBattingRun;
        Scanner sc = new Scanner(System.in);
        System.out.println("How much over start will play?");
        over = sc.nextInt();
        System.out.println("The play start in " + over + " over");

        System.out.println("first Batting name: ");
        firstBatting = sc.next();
        System.out.println("First Batting name: " + firstBatting);

        System.out.println("second Batting name: ");
        secondBatting = sc.next();
        System.out.println("Second Batting name: " + secondBatting);






        for (i = 1; i <= over; i++) {


           /* if (fBattingRun == zeroRun || fBattingRun == twoRun || fBattingRun == fourRun
                    || fBattingRun == sixRun) {
                System.out.println("First Batting Run: " + firstBatting);
            } else if (secondBatting == oneRun || secondBatting == threeRun) {
                System.out.println("Second Batting Run: " + secondBatting);
            } else {
                System.out.println("You don't know the cricket rules.");
            }*/
        }
    }
}


   


