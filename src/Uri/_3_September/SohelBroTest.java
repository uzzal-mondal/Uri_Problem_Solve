package Uri._3_September;

public class SohelBroTest {
    public static void main(String[] args) {
        String date = "09-23-2020";
        getDateMonthShow(date);

    }

    public static void getDateMonthShow(String date) {

        String dateParts[] = date.split("-");

        String day = dateParts[0];
        String month = dateParts[1];
        String year = dateParts[2];

        System.out.println(year + "-" + day + "-" + month);
        /*System.out.println("Month "+month);
        System.out.println("Year "+year);*/


    }
}
