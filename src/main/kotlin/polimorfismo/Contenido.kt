package org.example.polimorfismo

abstract class Contenido(val titulo: String, val duracion: Int) {
    abstract val tipo: String

    override fun toString() = "$tipo: $titulo ($duracion)"
}