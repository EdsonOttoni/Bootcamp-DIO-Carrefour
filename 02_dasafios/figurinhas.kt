// Detalhe
// Desenvolva um programa capaz de ler um valor inteiro N. N * 2 linhas de saída vão ser apresentadas na execução do programa, 
// seguindo a lógica do exemplo mais abaixo. Para os valores com mais de seis dígitos, todos os dígitos devem ser apresentados.

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
