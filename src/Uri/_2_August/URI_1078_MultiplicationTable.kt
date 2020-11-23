package Uri._2_August

import java.util.*

fun main(args:Array<String>){

    var n:Int;
    var mul:Int;
    var sc = Scanner(System.`in`)
    n = sc.nextInt();
    for (i in 1..10){
        mul = i * n;
        println("$i x $n = $mul")
    }
}