// Desafio: verificar se é um número primo com inserção do usuário.

fun main() {

    val num = readLine()!!.toInt()
    var isPrime = true

    for (i in 2 until num) {
        if (num % i == 0) {
            isPrime = false
            break // interromper o loop

        }
    }

    if (isPrime) {
        println("$num é um número primo")
    } else {
        println("$num não é um número primo")
    }
}