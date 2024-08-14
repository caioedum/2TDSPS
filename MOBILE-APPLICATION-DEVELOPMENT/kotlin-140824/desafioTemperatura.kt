fun main() {

    println("Digite a temperatura: ")
    val celsius = readLine()!!.toDouble()
    val fahrenheit = (celsius * 9/5 + 32)
    val kelvin = (celsius + 273.15)

    println("A temperatura celsius digitada e: $celsius, convertida para fahrenheit e: $fahrenheit, convertida para kelvin e: $kelvin") 
    
}