fun main(a:Array<String>) {
    for (i in 1..5){
        for (j in 1..5) {
            print("*")
        }
        println()
    }
    for (i in 1..5) {
        for (j in 1..5) {
            print(i)
        }
        println()
    }
    for (i in 1..5) {
        for (j in 1..5) {
            print(j)
        }
        println()
    }
    for (i in 1..5) {
        for (j in 5 downTo 1) {
            print(j)
        }
        println()
    }
    for (i in 5 downTo 1) {
        for (j in 1..i) {
            print(i)
        }
        println()
    }
    for (i in 5 downTo 1) {
        for (j in i downTo 1) {
            print(j)
        }
        println()
    }
    for (i in 5 downTo 1) {
        for (j in 1..i) {
            print(j)
        }
        println()
    }
    for (i in 1..4) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    for (i in 1..4) {
        for (j in 1..i) {
            print(j)
        }
        println()
    }
    for (i in 1..5){
        for (j in 1..i){
            print(i)
        }
        println()
    }

}