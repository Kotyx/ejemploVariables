class Cliente

class Contacto(val id:Int,var email:String)

fun main(args: Array<String>){
    val cliente =Cliente()
    val contacto= Contacto(1,"juanramirez@centroafuera.es")

    println(contacto.id)
    contacto.email = "nuevocorreo@centroafuera.es"
}