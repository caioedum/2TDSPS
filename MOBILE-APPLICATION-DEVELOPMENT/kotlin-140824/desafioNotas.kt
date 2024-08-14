fun main() {
    val nota1 = 8.5
    val nota2 = 10.0
    val nota3 = 9.0

    val media = (nota1 + nota2 + nota3) / 3
    val mediaFormatada = String.format("%.2f", media)

    println("A media das notas e $mediaFormatada formatada")
}
