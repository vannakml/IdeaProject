import java.util.*

fun main(a:Array<String>) {
    val num:Int
    val s = Scanner(System.`in`)
    println("Enter a number: ")
    num = s.nextInt()
    var i = 0
    while (i < num){
        println("Hello world...")
        i++
    }
    do{
        println("The do statement is executed.")
    } while (i < num)
}