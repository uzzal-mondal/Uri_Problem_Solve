package Hacker_Rank.instanceOfInterface;

public interface Printable {

}

class A implements Printable {
    public void a() {
        System.out.println("a performed.");
    }
}

class B implements Printable {
    public void b() {
        System.out.println("b performed.");
    }
}

class Call {
    void invoke(Printable printable) {
        if (printable instanceof A) {
            A a = (A) printable;
            a.a();
        }
        if (printable instanceof B) {
            B b = (B) printable;
            b.b();
        }
    }
}

class mainTest{
    public static void main(String[] args){
        Printable p = new B();
        Call c = new Call();
        c.invoke(p);
    }
}
