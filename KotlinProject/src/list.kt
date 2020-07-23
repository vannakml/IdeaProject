fun main(a:Array<String>){
    var sample_list = listOf(1,2,3,4,5)
    // listOf<int>(1,2,3,4)
    // sample_list.add(6) // Error because it is an immutable list

    for (i in sample_list){
        println(i)
    }
    for (i in 0..sample_list.size-1){
        println(sample_list[i])
    }
}