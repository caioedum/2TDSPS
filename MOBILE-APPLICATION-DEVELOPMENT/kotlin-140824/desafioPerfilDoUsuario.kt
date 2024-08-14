fun main() {

    println("Digite o seu nome: ")
    val nome = readLine()!!.toString()

    println("Digite a sua idade: ")
    val idade = readLine()!!.toInt()

    println("Digite o seu e-mail: ")
    val email = readLine()!!.toString()

    println("Digite se o usuário está ativo: ")
    val usuarioAtivo = readLine()!!.toBoolean()

    val apresentar = ("Perfil do usuário: nome: $nome, idade: $idade, e-mail: $email, estado do usuário: $usuarioAtivo")

    println(apresentar)
}
