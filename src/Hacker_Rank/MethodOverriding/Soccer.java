package Hacker_Rank.MethodOverriding;

public class Soccer extends Sports {

    @Override
    String getName() {
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        // super.getNumOfTeamMembers();
        System.out.println("Each team has 11 players in "+getName());


    }
}
