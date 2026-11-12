package org.example.abstraccion

interface Recordatorio: Programable {
    val titulo: String
    override fun programar(hora: String) =
        println("Recordatorio '$titulo' programado para las $hora")
}