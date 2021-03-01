package A.FebruaryExamJava.Rabil;

public class MyClass {

    public int ins;

    public int add() {
        int a = 10;
        this.ins = a;
        int b = 5, c;
        c = a + b;
        System.out.println(c);
        return c;
    }

    public int mul(int a, int b) {
        int c = a * b;
        System.out.println(c);
        return c;
    }


    public void function() {
        System.out.println("First function..");
    }

    public void functionTwo() {
        System.out.println("Second function");
    }

}

class NewClass {

    public static void main(String args[]) {

        MyClass m = new MyClass();
        System.out.println(m.ins);
        m.add();
        m.mul(10, 6);

        //System.out.println(m.add(10, 5));
        m.function();
        m.functionTwo();


    }

}
