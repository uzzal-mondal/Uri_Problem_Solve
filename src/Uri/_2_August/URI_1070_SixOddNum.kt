package Uri._2_August

import java.util.*

fun main(args: Array<String>) {
    var num: Int;
    var sc = Scanner(System.`in`);
    num = sc.nextInt();

    if (num % 2 == 0) {
        num += 1;
    }

    for (i in 0..5) {
        if (num % 2 != 0) {
            println(num)
        }
        num+=2;
    }
}