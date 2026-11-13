package org.example.polimorfismo

class GestorDescargas {
    private val descargados = mutableListOf<Descargable>()

    val cantidad: Int
        get() = descargados.size

    fun descargar(item: Descargable) {
        item.descargar()
        descargados.add(item)
    }

    fun descargar(items: List<Descargable>) {
        items.forEach { descargar(it) }
    }
}
