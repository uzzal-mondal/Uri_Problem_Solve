package BITMJava21.Inheritace;

public class InheritTest {
    public static void main(String[] args) {

        Seip s = new Seip("uzzal", "15224", "01940520967",
                "25642", 452300.00);

       /* System.out.println(s.getName());
        System.out.println(s.getSeipId());*/

        Colaberative c = new Colaberative("Mujahid", "2542",
                "016522", 25633, "MK7LAB");
        //System.out.println(c.getCompanyName());

        BitmStudent[] b = {s, c};
        for (BitmStudent bs : b) {
            System.out.println(bs.getInfo());
        }


    }
}
