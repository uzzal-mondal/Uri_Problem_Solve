package Uri._1_July;

import java.util.Scanner;

public class URI_1019_TimeConversation {
    public static void main(String[] args) {

        int second, hour, minute;
        Scanner sc = new Scanner(System.in);
        second = sc.nextInt();

        hour = second / 3600;
        second = second % 3600;
        minute = second / 60;
        second = second % 60;
        System.out.printf("%d:%d:%d\n",hour,minute,second);
    }
}
