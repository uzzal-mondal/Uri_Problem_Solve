package HeadFirstJava.NonStaticFinalVariable;

public class Foof {
    final int size = 3;
    final int whuffie;

    public Foof() {
        whuffie = 42;
    }

    public Foof(int whuffie) {
        this.whuffie = whuffie;
    }

    void doMore() {
        final int z = 7;
    }
}

//Todo: final method.
class Poof {
    final void calcWhuffie() {
      //can't be override.
    }
}

//Todo: final class
final class MyMostPerfectClass {
    // can't be extended.
}
