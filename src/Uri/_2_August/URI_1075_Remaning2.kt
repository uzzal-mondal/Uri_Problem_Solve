package Uri._2_August

import java.util.*

fun main(args:Array<String>){
    var n:Int;
    var sc = Scanner(System.`in`);
    n = sc.nextInt();

    for (i in 1..10000){
        if (i % n == 2){
            println(i)
        }
    }
}