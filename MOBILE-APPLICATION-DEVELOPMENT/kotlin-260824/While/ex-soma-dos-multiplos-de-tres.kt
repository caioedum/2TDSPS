// Exercício 2 - Soma dos múltiplos de 3
fun main() {

    println("Digite um numero inteiro positivo: ")
    val numero = readLine()!!.toInt()

    var soma = 0
    var contador = 3
    while (contador <= numero) {
        soma += contador
        contador += 3
    }
    println("A soma dos múltiplos de 3 até $numero é: $soma")
}