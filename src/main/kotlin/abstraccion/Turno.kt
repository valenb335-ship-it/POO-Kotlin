package org.example.abstraccion

class Turno (override val titulo: String, override val idRegistro: String) : Recordatorio, Registrable {

    override fun registrar() {
        println("Turno registrado")
    }

    override fun descripcion(): String =  "Elemento ${super<Recordatorio>.descripcion()} y ${super<Registrable>.descripcion()}"


}