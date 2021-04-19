package A.JavaHeadFirst;

public class BetweenStaticOrNonStatic {
    public static void main(String[] args) {
        Song t2 = new Song("Allah.");
        System.out.println(t2);

    }
    public static class Song {
        String title;
        //private static int songCount = 0;


        private Song(String t) {
            System.out.println(Math.multiplyHigh(10,5));
            title = t;
            System.out.println(title);
            //songCount++;
           // System.out.println(songCount);
        }

        public void play(){

        }
    }
}
