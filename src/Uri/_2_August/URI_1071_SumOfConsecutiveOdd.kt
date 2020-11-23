package Uri._2_August

import java.util.*

fun main(args: Array<String>) {

    var x: Int;
    var y: Int;
    var sum = 0;

    var sc = Scanner(System.`in`);
    x = sc.nextInt();
    y = sc.nextInt();

    if (x > y) {
        for (i in y + 1 until x) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
    }
    println(sum)

}