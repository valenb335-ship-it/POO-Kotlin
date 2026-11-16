package org.example.polimorfismo

import kotlin.random.Random

class AudioLibro(titulo: String, duracion: Int, val capitulos: Int): Contenido(titulo, duracion), Descargable, Retomable {

    override val tipo = "Audiolibro"
    private var minutoGuardado = 0

    override fun descargar() {
        for (i in 1..capitulos) println("  capítulo $i/$capitulos")
    }

    override fun guardarProgreso(minuto: Int) {
        minutoGuardado = minuto.coerceIn(0, duracion)
    }

    override fun retomar(): String {
        val capitulo = minOf(minutoGuardado / (duracion / capitulos) + 1, capitulos)
        return "Retomando '$titulo' en el capítulo $capitulo (minuto $minutoGuardado)"
    }
}