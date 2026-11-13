package org.example.polimorfismo

interface Retomable {
    fun guardarProgreso(minuto: Int)
    fun retomar(): String
}