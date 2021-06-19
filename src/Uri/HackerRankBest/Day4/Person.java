package Uri.HackerRankBest.Day4;

public class Person {
    private int age;

    /**
     * create a constructor and pass to local variable.
     * @param initialAge
     */
    public Person(int initialAge) {
        // Add some more code to run some checks on initialAge
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
        }else {
            this.age = initialAge;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * this is old method declare.
     */
    public void amIOld() {
        if (age < 0) {
            System.out.println("Age is not valid, setting age to 0.");
        } else if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        age++;
    }
}
