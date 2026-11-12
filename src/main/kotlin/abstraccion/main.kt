package org.example.abstraccion

/*
fun main(){
val notificaciones: List<Notificacion> = listOf(
    NotificacionEmail("ana@mail.com", "Tu pedido fue enviado", "Pedido #1234"),
    NotificacionSms("2804123456", "Tu código de verificación es 4821"),
    NotificacionSms("1245", "Hola")
)

    notificaciones.forEach { it.enviar() }
}

 */


fun main(){
 val turno = Turno("Turno con el dentista", "REC-001")
    turno.programar("10:30")
    turno.registrar()
    println(turno.descripcion())
}
