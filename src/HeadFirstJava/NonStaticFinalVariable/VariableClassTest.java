package HeadFirstJava.NonStaticFinalVariable;

public class VariableClassTest {
    public static void main(String[] args) {

        Foo foo = new Foo();
       // foo.go(12);

    }
}

class Foo {
   static final int x = 12;


    public void go(final int x) {
        System.out.println(x);
    }

}

