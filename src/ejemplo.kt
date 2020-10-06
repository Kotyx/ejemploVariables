fun main(args: Array<String>){
    //Variables
    var variableInt: Int
    var variable2: Long =10

    //constante
    val variable = 1

    //variable2 = variable - Error de compilacion

    variable2 = variable.toLong()

    //comprobaciones del tipo de dato

    if(variable is Int)
        println("el dato es entero")
    else
        println("el dato no es tipo entero")

    //proteccion de las variables contra los null
    // No permite la asignacion a Null
    var nuncaNull: String= "esta variable nunca podra ser null"
    var nunable: String?="esta varible si es null"
    nunable=null

    fun strlength(notNull:String):Int{
        return notNull.length
    }

    strlength(nuncaNull)
    //strlength(nullable)-error de compilacion

    fun describestring(puedesernull : String?):String{
        if(puedesernull != null && puedesernull.length>0)
            return "longtud del string: ${puedesernull.length}"
        else
            return "valor vacio o null"

    }
    var resultado=describestring(nunable)
    print(resultado)
    describestring(nuncaNull)

    val miarraydeenteros= arrayOf<Int>(10,20,30)
    val myarraydebool= booleanArrayOf(true,true,false)
    val miarraydeString= arrayOf("Juan","Maria","Samuel")

    println("Resultado de la array, posicion 0: ${miarraydeenteros[0].toString()}")

    //Array booleanos
    println(myarraydebool[0])
    println("Resultado de la array, posicion 0: ${myarraydebool[0].toString()}")

    //Array de String
    println(miarraydeString[0])
    println("Resultado de la array, posicion 0: ${miarraydeString[0].toString()}")
}