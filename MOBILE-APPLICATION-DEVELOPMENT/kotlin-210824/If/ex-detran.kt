// Exercício - Detran
// Criar um programa que verifica se o usuário possui ou carteira de habilitação.

fun main() {

    val idade = 25
    val possuiCarteiraDeMotorista = true // Possui CNH

    // Verificar se a pessoa é maior de idade e possui CNH
    if (idade >= 18 && possuiCarteiraDeMotorista) {

        println("Voce pode dirigir legalmente.")

    } else {

        println("Você nao pode dirigir legalmente.")

    }

    val temIngresso = false
    val estaComCamisaDoTime = true
    // Verifica se a pessoa tem ingresso OU está com a camisa do time
    if (temIngresso || estaComCamisaDoTime) {

        println("Voce pode entrar no estadio.")

    } else {

        println("Voce nao pode entrar no estadio.")

    }
}