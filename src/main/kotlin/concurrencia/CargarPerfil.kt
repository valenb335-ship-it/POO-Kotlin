package concurrencia

import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.seconds
import kotlin.time.measureTime

data class Usuario (val nombre : String)
data class Publicacion (val titulo: String)

suspend fun obtenerUsuario(): Usuario{
    delay(2.seconds)
    return Usuario("ana")
}

suspend fun obtenerPublicaciones(): List<Publicacion>{
    delay(3.seconds)
    return listOf(Publicacion("Publicacion : 1"), Publicacion("Publicacion : Aprendiendo Kotlin"))
}

// Con concurrencia

suspend fun main() = coroutineScope {
    val tiempo = measureTime{

        val usuario = async {obtenerUsuario()}
        val publicaciones = async {obtenerPublicaciones()}

        println("Usuario: ${usuario.await().nombre}")
        println("Publicaciones: ${publicaciones.await().map {it.titulo}}")
    }

    println("Pantalla cargada en $tiempo")
}

//Sin Concurrencia
/*
suspend fun main() = coroutineScope {
    val tiempo = measureTime{

        val usuario = obtenerUsuario()
        val publicaciones = obtenerPublicaciones()

        println("Usuario: ${usuario.nombre}")
        println("Publicaciones: ${publicaciones.map {it.titulo}}")
    }

    println("Pantalla cargada en $tiempo")
}

 */