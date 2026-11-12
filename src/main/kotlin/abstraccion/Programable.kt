package org.example.abstraccion

interface Programable {
    fun programar(hora: String)
    fun descripcion(): String = "programable"
}