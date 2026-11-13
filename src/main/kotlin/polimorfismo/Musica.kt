package org.example.polimorfismo

class Musica(titulo: String, duracion: Int, private var calidad: String): Contenido(titulo, duracion), Descargable {

    override val tipo = "Cancion"

    override fun descargar() = println("Descargando '$titulo' completa en calidad $calidad")

}