// Há um país denominado Lolipad, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os 
// recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Loli, cujo símbolo é o R$.
// Você terá o desafio de ler um valor com duas casas decimais, equivalente ao salário de uma pessoa de Loli. Em seguida, calcule e mostre o valor que esta pessoa deve 
// pagar de Imposto de Renda, segundo a tabela abaixo.
// Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é 
// isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser 
// impresso com duas casas decimais

fun main(args: Array<String>) {
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val s = readLine()!!.toFloat()
    val i: Float


    if(s > 0.0 && s <= 2000.00){
        println("Isento")
    }else if (s >= 2000.01 && s <= 3000.00){
        i = (s - 2000) * 0.08.toFloat()
        println("R$ ${i.format(2)}")
    }else if(s >= 3000.01 && s <= 4500.00){
        i = (s - 3000) * 0.18.toFloat() + 1000.00.toFloat() * 0.08.toFloat()
        println("R$ ${i.format(2)}")
    }else if( s > 4500){
        i = ((s - 4500.00) * 0.28.toFloat() + 1500.00.toFloat() * 0.18.toFloat() + 1000.00.toFloat() * 0.08.toFloat()).toFloat()
        println("R$ ${i.format(2)}")
    }
}
