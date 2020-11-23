package Hacker_Rank.MethodOverriding2;

public class Motorcycle extends  BiCycle{

    @Override
    String define_me(){
        return "a cycle with an engine";
    }

    Motorcycle(){
        System.out.println("Hello I am a motorcycle, I am "+define_me());
        String temp = super.define_me();
        System.out.println("My ancestor is a cycle who is "+temp);
    }
}
