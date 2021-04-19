package A.FebruaryExamJavaRabbilSir.Rabil.Interface;

public class InterfaceNew implements FirstClass, second, third{
    @Override
    public void showInter() {
        System.out.println("Interface class.");
    }

    @Override
    public void showSecond() {
        System.out.println("Show second.");
    }

    @Override
    public void showThird() {
        System.out.println("Show third.");
    }
}
