fun main(a:Array<String>){
    var sample_set = setOf(1,2,3,2,4) // 1,2,3,4
    // setOf<int>(1,2,3,4)
    for (i in sample_set){
        println(i)
    }
    println("size of set "+sample_set.size)
    // set doesn't have get method or calling by index
}