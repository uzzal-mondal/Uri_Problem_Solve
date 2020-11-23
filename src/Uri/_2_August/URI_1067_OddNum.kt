package Uri._2_August

import java.util.*

fun main(args: Array<String>) {
    var x: Int;
    var sc = Scanner(System.`in`);
    x = sc.nextInt();

    for (i in 1..x) {
        if (i % 2 != 0){
            println(i);
        }
    }
}