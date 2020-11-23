package Uri._2_August

import java.util.*

fun main(args: Array<String>) {
    var num: Int;
    var x: Int;

    var sc = Scanner(System.`in`)
    num = sc.nextInt();

    for (i in 1..num) {
        x = sc.nextInt();
        if (x == 0) {
            println("NULL")
        } else if (x > 0) {
            if (x % 2 == 0) {
                println("EVEN POSITIVE")
            } else {
                println("ODD POSITIVE")
            }
        } else if (x < 0) {
            if (x % 2 != 0) {
                println("ODD NEGATIVE")
            } else {
                println("EVEN NEGATIVE")
            }
        }

    }
}