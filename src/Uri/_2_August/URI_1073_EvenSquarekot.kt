package Uri._2_August

import java.util.*

fun main(args: Array<String>) {
    var n: Int;
    var sc = Scanner(System.`in`);
    n = sc.nextInt();

    for (i in 1..n) {
        if (i % 2 == 0) {
            println("$i^2 = ${i*i}")
        }
    }

    println("Hello World")
}