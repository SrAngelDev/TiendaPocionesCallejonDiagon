package srangeldev.models

class MagosYBrujasImpl() : MagosYBrujas, Clientes {
    override fun buscarPocionesAvanzadas() {
        println("Buscando pociones avanzadas como magos y brujas profesionales")
    }

    override fun comprarPociones() {
        println("Comprando pociones como magos y brujas profesionales")
    }

    override fun comprarMaterialesMagicos() {
        println("Comprando materiales magicos como magos y brujas profesionales")
    }
}