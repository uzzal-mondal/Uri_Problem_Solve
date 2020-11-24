package HeadFirstJava.StaticVariableInitialize;

public class PlayerTestDrive {
    public static void main(String args[]) {
        System.out.println(Player.playerCount);
        Player player = new Player("Tiger Woods");
        System.out.println(Player.playerCount);
        int pc = Player.playerCount;
        System.out.println(pc);
        System.out.println(pc);
    }
}
