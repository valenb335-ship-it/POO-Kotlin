package org.example.herencia

class Farmacia(nombre: String): Comercio(nombre) {

    override fun crearEnvio(distanciaKm: Double): Envio = EnvioRapido(distanciaKm)
}