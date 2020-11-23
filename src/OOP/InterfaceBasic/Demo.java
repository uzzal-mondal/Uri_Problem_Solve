package OOP.InterfaceBasic;

public class Demo implements MyInterface {


    @Override
    public void myFirstClick() {
        System.out.println("My first Click");;
    }

    @Override
    public void mySecondClick() {
        System.out.println("My Second click.");
    }
}
