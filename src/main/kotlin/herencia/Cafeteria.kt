package org.example.herencia

class Cafeteria(nombre: String): Comercio(nombre) {

    override fun crearEnvio(distanciaKm: Double): Envio = EnvioBicicleta(distanciaKm)
}