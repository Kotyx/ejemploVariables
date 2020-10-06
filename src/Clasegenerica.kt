/*
* Generics es un mecanismo general que se utiliza en Lenguajes de programacion modernos
* Puede haber clases genericas y funciones genericas
* Permite aumentar la reutilizacion del codigo y el encapsulamiento independizando el tipo de datos
* */
class PilaVariable<E>(vararg items: E){
    private val elements = items.toMutableList()

    fun push(element: E)=elements.add(element)

    fun peek():E = elements.last()

    fun pop():E = elements.removeAt(elements.size-1)

    fun isEmpty()=elements.isEmpty()

    fun size() = elements.size

    override fun toString()= "PilaVariable(${elements.joinToString()})"
}

fun <E> pilaVarible(vararg elements: E) = PilaVariable(*elements)

fun main(){
    val pila = pilaVarible(0.62, 3.14, 2,7)
    println(pila)
}