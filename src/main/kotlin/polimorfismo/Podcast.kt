package org.example.polimorfismo

class Podcast(titulo: String, duracion: Int): Contenido(titulo, duracion), Descargable, Retomable {

    override val tipo = "Podcast"

    private var minutoGuardado = 0

    override fun descargar() = println("Descargando episodio '$titulo' (se borrará al terminar de escucharlo)")

    override fun guardarProgreso(minuto: Int) {
        minutoGuardado = minuto.coerceIn(0, duracion)
    }

    override fun retomar() = "Retomando '$titulo' en el minuto $minutoGuardado"
}