fun main() {

    val num = readLine()!!.toInt()
    val listaNumeros = mutableListOf<Int>()
    
    if (num % 2 == 0) {
        listaNumeros.add(num)
    } else {
        println("Numero não é par")
    }

    println(listaNumeros)
}