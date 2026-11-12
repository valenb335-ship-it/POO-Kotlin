package org.example.abstraccion

class NotificacionEmail(destinatario: String, mensaje: String, val asunto: String) : Notificacion(destinatario, mensaje) {

    override val canal = "EMAIL"

    override fun esValido() = destinatario.contains("@")
    override fun formatear() = "Asunto: $asunto | $mensaje"
    override fun entregar(contenido: String) = println("[$canal] Para: $destinatario --> $contenido")
}