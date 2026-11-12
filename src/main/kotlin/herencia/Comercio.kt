package org.example.herencia

abstract class Comercio(val nombre: String) {

    fun confirmarPedido(subtotal: Double, distanciaKm: Double) {
        val envio = crearEnvio(distanciaKm)          // el factory method
        val total = subtotal + envio.costo()
        println("[$nombre] Pedido confirmado. $envio. Total: \$$total")
    }

    protected abstract fun crearEnvio(distanciaKm: Double): Envio
}