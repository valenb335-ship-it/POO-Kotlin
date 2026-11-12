package org.example.herencia

open class Envio(protected val distancia: Double) {

    open fun costo(): Double = distancia * 500
    open fun tiempoEstimado(): Int = 40

    override fun toString(): String = "${javaClass.simpleName}: \$${costo()} - ${tiempoEstimado()} min"
}