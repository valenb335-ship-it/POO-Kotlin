package org.example.polimorfismo

fun main(){

    
    val album = listOf(
        Musica("cancion1", 4, "alta"),
        Musica("cancion2", 3, "alta"),
        Musica("cancion3", 5, "alta")
        )

    val podcast = Podcast("Historias de la ciencia", 60)


    val gestor = GestorDescargas()
    gestor.descargar(album)
    gestor.descargar(podcast)
    println("Descargas: ${gestor.cantidad}")



/*
    val libro = AudioLibro("El viaje", 300, 3)
    val podcast = Podcast("Historias de la Informatica", 60)
    podcast.guardarProgreso(35)
    libro.guardarProgreso(150)
    val continuar: List<Retomable> = listOf(podcast, libro)
    continuar.forEach { println(it.retomar()) }


 */


}