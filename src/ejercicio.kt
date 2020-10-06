fun readIntFromKeyboard(): Int {
    var result: Int?
    val keyboardReader=readLine()
    do {
        val selectedOption = keyboardReader?.toInt()
        result = try {
            selectedOption?.toInt()
        } catch (e: NumberFormatException) {
            println("Lo que has introducido no es un número.")
            null
        }
    } while (result == null)
    return result
}

fun getRandomNumber(rango: IntRange): Int {
    return rango.random()
}
fun main(args:Array<String>){

    var rand=getRandomNumber(0..9)
    do{
        var resul= readIntFromKeyboard()
        if(resul==rand)
            println("El numero es correcto: $rand")
        else
            if(resul<rand)
                println("El numero ha de ser mayor")
            else
                println("El numero ha de se menor")
    }while(resul != rand)
}