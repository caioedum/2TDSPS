// Crie um programa que verifica se o usuário tem acesso ao sistema ou nao

fun main() {

    println("Digite o nome do usuário: ")
    val usuarioInput = readLine()

    println("Digite a senha do usuário: ")
    val senhaInput = readLine()

    if (usuarioInput == "caioeduardo" && senhaInput == "1234567" ) {

        println("Acesso permitido.")

    } else {

        println("Acesso negado.")

    }

}