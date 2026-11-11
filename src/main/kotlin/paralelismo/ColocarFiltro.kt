package paralelismo

import kotlinx.coroutines.*
import kotlin.time.measureTime

fun aplicarFiltro(foto: String): String{
    var total = 0L
    for (i in 1..300_000_000L){
        total += i % 7
    }
    println("$foto procesada en ${Thread.currentThread().name}")
    return "$foto filtrada (brillo: ${total % 256})"
}

//Paralelo

suspend fun main() {
    val fotos = listOf("foto1.jpg", "foto2.jpg", "foto3.jpg", "foto4.jpg")

    val tiempo = measureTime {
        val resultados = withContext(Dispatchers.Default){
            fotos.map {foto -> async {aplicarFiltro(foto)}}.awaitAll()
        }
        println(resultados)
    }
    println("Tiempo: $tiempo")
}



//Secuencial
/*
suspend fun main() {
    val fotos = listOf("foto1.jpg", "foto2.jpg", "foto3.jpg", "foto4.jpg")

    val tiempo = measureTime {
        val resultados = fotos.map {foto -> aplicarFiltro(foto)}
        println(resultados)
    }
    println("Tiempo: $tiempo")
}


 */


