package Hacker_Rank.MethodOverriding;

public class LauncherMO {
    public static void main(String[] args) {

        Sports s1 = new Sports();
        System.out.println(s1.getName());
        s1.getNumberOfTeamMembers();

        Soccer s2 = new Soccer();
        System.out.println(s2.getName());
        s2.getNumberOfTeamMembers();
    }

}
