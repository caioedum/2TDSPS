fun main() {

    var precoCoxinha = 5.00
    var precoCerveja = 15.00
    var quantidadeCoxinha = 3
    var quantidadeCerveja = 2
    var somatoria = precoCoxinha * quantidadeCoxinha + precoCerveja * quantidadeCerveja
    var taxa =  somatoria * 0.10
    var totalCoxinha = quantidadeCoxinha * precoCoxinha
    var totalCerveja = quantidadeCerveja * precoCerveja
    
    var totalCobrado = somatoria + taxa


    println("----------------------------------------------------------")
    println("\tConsole")
    println("----------------------------------------------------------")
    println("\t.: Lanchonete Caio :.")
    println("--------------------------------------------------")
    println("$quantidadeCoxinha coxinhas \tR$ %.2f".format(totalCoxinha))
    println("$quantidadeCerveja cervejas \tR$ %.2f".format(totalCerveja))
    println("Somatória \tR$ %.2f".format(somatoria))
    println("Taxa \tR$ %.2f".format(taxa))
    println("--------------------------------------------------")
    println("Conta final \tR$ %.2f".format(totalCobrado))
    


    



}