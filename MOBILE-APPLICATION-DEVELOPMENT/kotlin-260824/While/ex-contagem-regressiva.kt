// Exercício 1 - Contagem Regressiva

fun main() {
    println("Digite um número inteiro positivo")
    val input = readLine()!!.toInt()

    if(input != null && input.isNotEmpty()) {
        val numero = input.toInt()
    
    var contador = numero // Iniciar o contador com o número fornecido
    while (contador >= 1) { // Enquanto o contador for maior ou igual a 1
        println(contador) // Imprimi o valor atual do contador
        contador-- // Decrementa o contador em 1 a cada interação
        }
    }
    else {
        println("Entrada invalida")
    }
}