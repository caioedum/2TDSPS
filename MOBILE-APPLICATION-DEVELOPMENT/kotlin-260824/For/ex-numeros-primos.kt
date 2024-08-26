fun main() {

    val num = 17 //Definindo o numero que será verificado se é primo ou não
    var isPrime = true //Variável como true assumindo inicialmente que é primo

    //
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