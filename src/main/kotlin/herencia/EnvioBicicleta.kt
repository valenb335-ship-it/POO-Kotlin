package org.example.herencia

class EnvioBicicleta(distancia: Double): Envio(distancia) {

    override fun costo(): Double = super.costo() * 0.8
    override fun tiempoEstimado(): Int = super.tiempoEstimado() + 10
}