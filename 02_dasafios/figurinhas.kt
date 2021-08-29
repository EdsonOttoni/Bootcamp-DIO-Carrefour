fun main(args: Array<String>) {
    val list = mutableListOf<Int>()

    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        if(input.size == 2){
            val valueMdc = mdc(input[0], input[1])
            list.add(valueMdc)
        }
    }

    for (i in list){
        println(i)
    }
}

fun mdc(n1: Int, n2: Int): Int {
    var r: Int
    var n1 = n1
    var n2 = n2

    do {
        r = n1%n2
        n1 = n2
        n2 = r
    } while (r != 0)
    return n1
}S