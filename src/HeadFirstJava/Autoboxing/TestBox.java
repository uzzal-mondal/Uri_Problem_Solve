package HeadFirstJava.Autoboxing;

import java.util.Calendar;

public class TestBox {

    static int DAY_IM = 1000 * 60* 60*24;

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2004,0,7,15,40);
        long day1 = c.getTimeInMillis();
        for (int x = 0; x <=60; x++){
            day1 = (long) (day1 + (DAY_IM * 29.52));
            //c.setTimeInMillis(String.format("full moon"));
        }


    }










    /*Integer i;
    int j;

    public static void main(String[] args){
        TestBox t = new TestBox();
        t.go();

        Calendar c = Calendar.getInstance();
        c.set(2020,0,7,15,40);
        System.out.println(c.getCalendarType());

    }

    public void go(){
        //j = i;
        System.out.println(j);
        System.out.println(i);

        String s = "2";
        int x = Integer.parseInt(s);
        System.out.println(x);
        double d = Double.parseDouble("420.24");
        System.out.println(d);

       *//* String t = "two";
        int y = Integer.parseInt(t);
        System.out.println(y);*//*

        double dm = 42.5;
        String doubleString = ""+dm;
        System.out.println(doubleString);
    }*/
}
