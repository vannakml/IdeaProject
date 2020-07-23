
fun main(a:Array<String>){
    var arr1 = arrayOf(1, 2, 3)

    for(i in 0..2){
        println(arr1[i])
    }
    var arr2 = intArrayOf(11, 22, 33)

    arr2[0] = 55
    for (i in 0..2){
        println(arr2.get(i))
    }
}