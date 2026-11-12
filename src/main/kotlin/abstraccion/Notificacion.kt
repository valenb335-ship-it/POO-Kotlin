package org.example.abstraccion

abstract class Notificacion(val destinatario: String, val mensaje: String) {

    abstract val canal: String

    fun enviar(){
        if (!esValido()){
            println("[$canal] No fue posible enviar mensaje a $destinatario: Datos invalidos")
            return
        }
        entregar(formatear())
    }

    protected abstract fun esValido(): Boolean
    protected abstract fun entregar(contenido: String)

    protected open fun formatear(): String = mensaje
}