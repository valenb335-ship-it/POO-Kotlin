package org.example.abstraccion

interface Registrable {
    val idRegistro: String
    fun registrar()
    fun descripcion(): String = "registrable"
}