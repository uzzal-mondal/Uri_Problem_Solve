package Uri._8_Mearch.PlayingCricket;

import java.util.Random;

public class CricketMain {
    public static void main(String[] args) {
        System.out.println("Mirpur National Stadium");
        Player p1 = new Player();
        p1.setName("Mash");
        p1.setTeam("Bangladesh");
        Player p2 = new Player();
        p2.setName("David Warner");
        p2.setTeam("Australia");

        //toss.
        Random toss = new Random();
        int tossValue = toss.nextInt(2);
        // System.out.println(tossValue);
        if (tossValue == 1) {
            System.out.println(p1.getName() + " Won the Toss.");
        } else {
            System.out.println(p2.getName() + " Won the Toss.");
        }

        //make choose.
        Random choose = new Random();
        int batOrBall = choose.nextInt(2);
        if (batOrBall == 1) {
            switch (tossValue) {
                case 0:
                    System.out.println(p2.getTeam() + " decided to Bat first.");
                    for (int i = 0; i < 6; i++) {
                        p2.over = new int[6];
                        p2.over[i] = choose.nextInt(7);
                        p2.score = p2.score + p2.over[i];
                        System.out.println(p2.getName() + " Total score is " + p2.score);
                    }
                    System.out.println(p1.getName() + "need " + " Total score is " + (p2.score + 1) + "runs to win");

                    for (int i = 0; i < 6; i++) {
                        p1.over = new int[6];
                        p1.over[i] = choose.nextInt(7);
                        p1.score = p1.score + p1.over[i];
                        System.out.println(p1.getName() + " Total score is " + p1.score);
                        if (p1.score > p2.score) {
                            System.out.println(p1.getName() + " won the match");
                            break;
                        }

                    }
                    if (p1.score < p2.score) {
                        System.out.println(p2.getName() + " won the match");
                        break;
                    }


                    break;
                default:
                    System.out.println(p1.getTeam() + " decided to Bat first.");
                    for (int i = 0; i < 6; i++) {
                        p1.over = new int[6];
                        p1.over[i] = choose.nextInt(7);
                        p1.score = p2.score + p2.over[i];
                        System.out.println(p1.getName() + " Total score is " + p1.score);


                    }
                    System.out.println(p1.getName() + "need " + " Total score is " + (p1.score + 1) + "runs to win");

                    for (int i = 0; i < 6; i++) {
                        p2.over = new int[6];
                        p2.over[i] = choose.nextInt(7);
                        p2.score = p1.score + p1.over[i];
                        System.out.println(p2.getName() + " Total score is " + p2.score);
                        if (p2.score > p1.score) {
                            System.out.println(p2.getName() + " won the match");
                            break;
                        }

                    }
                    if (p1.score < p2.score) {
                        System.out.println(p1.getName() + " won the match");
                        break;
                    }


                    break;
            }
        } else {
            switch (tossValue) {
                case 0:
                    System.out.println(p2.getTeam() + " decided to Bowl first.");
                    for (int i = 0; i < 6; i++) {
                        p1.over = new int[6];
                        p1.over[i] = choose.nextInt(7);
                        p1.score = p1.score + p1.over[i];
                        System.out.println(p2.getName() + " Total score is " + p1.score);
                    }
                    System.out.println(p1.getName() + " need " + " Total score is " + (p1.score + 1) + "runs to win");
                    break;
                default:
                    System.out.println(p1.getTeam() + " decided to Bowl first.");
                    for (int i = 0; i < 6; i++) {
                        p2.over = new int[6];
                        p2.over[i] = choose.nextInt(7);
                        p2.score = p2.score + p2.over[i];
                        System.out.println(p2.getName() + " Total score is " + p2.score);
                    }
                    System.out.println(p2.getName() + " need " + " Total score is " + (p2.score + 1) + "runs to win");
                    break;
            }

        }

    }
}
