package org.example.herencia
fun main(){
    val supermercado = Supermercado("La Anonima")
    val cafeteria = Cafeteria("Barile")
    val farmacia = Farmacia("Farmacia")

    supermercado.confirmarPedido(25000.0,  5.0)
    cafeteria.confirmarPedido( 4500.0,  1.5)
    farmacia.confirmarPedido( 12000.0, 3.0)
}
