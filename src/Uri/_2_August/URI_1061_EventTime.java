package Uri._2_August;

import java.util.Scanner;

public class URI_1061_EventTime {
    public static void main(String[] args) {
        String string;
        int d1, h1, m1, s1,
                d2, h2, m2, s2,
                ds1, ds2, et,
                day, hour, minute, second;
        Scanner sc = new Scanner(System.in);
        string = sc.next();
        d1 = sc.nextInt();
        h1 = sc.nextInt();
        string = sc.next();
        m1 = sc.nextInt();
        string = sc.next();
        s1 = sc.nextInt();
        //todo:then second day input ..)
        string = sc.next();
        d2 = sc.nextInt();
        h2 = sc.nextInt();
        string = sc.next();
        m2 = sc.nextInt();
        string = sc.next();
        s2 = sc.nextInt();

        ds1 = (d1 * 24 * 60 * 60 ) + (h1 * 60 * 60) + (m1 * 60) + s1;
        ds2 = (d2 * 24 * 60 * 60 ) + (h2 * 60 * 60) + (m2 * 60) + s2;
        et = ds2 - ds1;

        day = et / (24 * 60 * 60 );
        et = et % (24 * 60 * 60 );
        hour = et / (60 * 60);
        et = et % 3600;
        minute = et / (60);
        second = et % 60;

        System.out.println(day + " dia(s)");
        System.out.println(hour + " hora(s)");
        System.out.println(minute + " minuto(s)");
        System.out.println(second + " segundo(s)");


    }
}
