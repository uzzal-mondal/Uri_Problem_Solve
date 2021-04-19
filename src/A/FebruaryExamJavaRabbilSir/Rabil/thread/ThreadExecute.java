package A.FebruaryExamJavaRabbilSir.Rabil.thread;

import static java.lang.Thread.sleep;

public class ThreadExecute {
    public static void main(String[] args) {
        A one = new A();
        one.start();
        B two = new B();
        two.start();
    }
}

class A extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Java");
        }
    }
}

