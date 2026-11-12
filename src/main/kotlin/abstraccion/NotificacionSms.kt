package org.example.abstraccion

class NotificacionSms(destinatario: String, mensaje: String): Notificacion(destinatario, mensaje) {

    override val canal = "SMS"

    override fun esValido() = destinatario.length >= 10  && mensaje.length <= 160

    override fun entregar(contenido: String) = println("[$canal] enviar a $destinatario --> $mensaje")


}