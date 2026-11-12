package org.example.herencia

class EnvioRapido(distancia:Double): Envio(distancia) {

    override fun costo(): Double = super.costo() * 1.5
    override fun tiempoEstimado(): Int = 15
}
