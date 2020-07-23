import java.util.*

fun main(a:Array<String>){
    var name: String
    var s = Scanner(System.`in`)
    println("Input your name: ")
    name = s.next()
    println("Enter number of times: ")
    var num = s.nextInt()

    for(i in 1..num){
        println(name)
    }
}