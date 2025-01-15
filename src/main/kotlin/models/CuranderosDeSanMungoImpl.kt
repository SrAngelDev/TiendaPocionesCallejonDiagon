package srangeldev.models

class CuranderosDeSanMungoImpl() : CuranderosDeSanMungo, Clientes{
    override fun comprarRemediosMedicinales() {
        println("Comprando remedios medicinales como curandero de San Mungo")
    }

    override fun comprarPociones() {
        println("Comprando pociones como Curandero")
    }

    override fun comprarMaterialesMagicos() {
        println("Comprando materiales magicos como Curandero")
    }
}