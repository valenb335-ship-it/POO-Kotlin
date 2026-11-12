package org.example.herencia

class Supermercado(nombre:String): Comercio(nombre) {

    override fun crearEnvio(distanciaKm: Double): Envio = Envio(distanciaKm)
}