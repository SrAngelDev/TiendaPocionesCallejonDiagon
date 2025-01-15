package srangeldev.models

class ColeccionistaDeArtefactosMagicosImpl() : ColeccionistaDeArtefactosMagicos, Clientes {
    override fun buscarObjetosRaros() {
        println("Buscando objetos raros y pociones exóticas como coleccionista de artefactos mágicos")
    }

    override fun comprarPociones() {
        println("Comprando pociones como Coleccionista")
    }

    override fun comprarMaterialesMagicos() {
        println("Comprando materiales magicos como Coleccionista")
    }
}