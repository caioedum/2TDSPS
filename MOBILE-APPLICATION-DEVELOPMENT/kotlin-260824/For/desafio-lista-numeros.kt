fun main() {

    val num = readLine()!!.toInt()
    val listaNumeros = mutableListOf<Int>()
    var soma = 0
    
    if (num % 2 == 0) {
        listaNumeros.add(num)
    } else {
        println("Numero não é par")
    }

    for (numero in listaNumeros) {
        soma += numero
    }

    println("A lista de números é $listaNumeros e a $soma de tudo é $soma")
}