fun main()  {

    println("Digite sua idade: ")
    val idadeInput = readLine()

    if (idadeInput == null) {
        println("Entrada inválida.")
        return
    }

    val idade = idadeInput.toIntOrNull()

    if (idade == null) {
        println("Idade inválida. Por favor, insira um número válido.")
        return
    }

    if (idade >=18) {
        println("Voce e maior de idade, pode encher a cara")
    } else {
        println("Voce e menor de idade, nao pode beber")
    }
        
    
}