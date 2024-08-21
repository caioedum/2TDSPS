//  Exercício - Avaliação de Notas
fun main() {

    // Definindo a n0ota do aluno(a)
    val nota = 85

    // Usando o when para avaliar o conceito de nota
    val conceito = when (nota) {
        in 0..49 -> "F" //Se ferrou muito
        in 50..59 -> "D" //Se ferrou pouco
        in 60..69 -> "C" //Se ferrou 
        in 70..79 -> "B" //Se deu bem
        in 80..100 -> "A" //Se deu muito bom
        else -> "Nota inválida"
    }


    // Exibindo o conceito de nota
    println("Conceito: $conceito")
}