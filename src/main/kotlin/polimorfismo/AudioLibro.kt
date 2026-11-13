package org.example.polimorfismo

import kotlin.random.Random

class AudioLibro(titulo: String, duracion: Int, val capitulos: Int): Contenido(titulo, duracion), Descargable, Retomable {

    override val tipo = "Audiolibro"
    private var minutoGuardado = 0
    private var capGuardado = 1

    override fun descargar() {
        println("Descargando '$titulo' por capítulos:")
        for (i in 1..capitulos) println("  capítulo $i/$capitulos")
    }

    override fun guardarProgreso(minuto: Int) {
        capGuardado = Random.nextInt(1, capitulos)
        minutoGuardado = minuto.coerceIn(0, duracion)
    }

    override fun retomar(): String {
        return "Retomando '$titulo' en el capítulo $capGuardado (minuto $minutoGuardado)"
    }
}