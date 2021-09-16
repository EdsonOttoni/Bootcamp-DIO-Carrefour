// Ricardo e Vicente são aficionados por figurinhas. Nas horas vagas, 
// eles arrumam um jeito de jogar um “bafo” ou algum outro jogo que envolva tais figurinhas. 
// Ambos também têm o hábito de trocarem as figuras repetidas com seus amigos e certo dia pensaram em uma brincadeira diferente.
// Chamaram todos os amigos e propuseram o seguinte: com as figurinhas em mãos, cada um tentava fazer uma troca com o amigo que estava mais perto seguindo a seguinte regra: 
// cada um contava quantas figurinhas tinha. Em seguida, eles tinham que dividir as figurinhas de cada um em pilhas do mesmo tamanho, no maior tamanho que fosse possível para
// ambos. Então, cada um escolhia uma das pilhas de figurinhas do amigo para receber. Por exemplo, se Ricardo e Vicente fossem trocar as figurinhas e tivessem respectivamente
// 8 e 12 figuras, ambos dividiam todas as suas figuras em pilhas de 4 figuras (Ricardo teria 2 pilhas e Vicente teria 3 pilhas) e ambos escolhiam uma pilha do amigo para receber.
import kotlin.math.pow

fun main() {
    val n = 1..(readLine() ?: return).toInt()
    n.forEach {
        println("$it ${(it.toDouble().pow(2)).toInt()} ${(it.toDouble().pow(3)).toInt()}")
        println("$it ${(it.toDouble().pow(2)).toInt() + 1} ${(it.toDouble().pow(3)).toInt() + 1}")
    }
}
