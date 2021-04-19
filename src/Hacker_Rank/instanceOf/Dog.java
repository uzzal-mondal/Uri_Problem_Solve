package Hacker_Rank.instanceOf;

public class Dog extends Animal {
    static void method(Animal a) {
        if (a instanceof Dog) {
            Dog d = (Dog) new Animal();
            System.out.println("ok down casting performed.");
        }
    }

}

class InstanceTest {
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog.method(a);

    }
}
