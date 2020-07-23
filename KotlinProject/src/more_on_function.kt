
fun main(a:Array<String>) {
    myfunc(27, 7, "Vannak")

    var result = test(600, 500)
    var result2 = test2(400, 600)
    var result3 = test3(1000, 600)

    println(result)
    println(result2)
    println(result3)
}
fun myfunc(a:Int, b:Int, name:String){
    println(a)
    println(b)
    println(name)
}

// if and when as expression
// var res = if (a>0) a else b

fun test(a:Int, b:Int): Int = a+b  // automatically return a + b without return keyword
fun test2(a:Int, b:Int):String = if (a>b) "a is bigger" else "b is bigger"
fun test3(a:Int, b:Int):Any = if (a>b) a else "b is bigger"
