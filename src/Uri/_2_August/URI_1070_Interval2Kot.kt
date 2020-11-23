package Uri._2_August

import java.util.*

fun main(args: Array<String>) {
    var num: Int;
    var x: Int;
    var countIn: Int = 0;
    var countOut: Int = 0;
    var sc = Scanner(System.`in`);
    num = sc.nextInt();

    for (i in 1..num) {
        x = sc.nextInt();
        if (x in 10..20) {  //if (x >= 10 && x <= 20)
            countIn++;
        } else {
            countOut++;
        }
    }

    println("$countIn in")
    println("$countOut out")
}