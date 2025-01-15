package srangeldev.models

class EstudianteHowartsImpl() : EstudianteHowarts, Clientes {
    override fun comprarIngredientes() {
        println("Comprando ingredientes para clases como Estudiante de Howarts")
    }

    override fun comprarPociones() {
        println("Comprando pociones como Estudiante de Howarts")
    }

    override fun comprarMaterialesMagicos() {
        println("Comprando materiales magicos como Estudiante de Howarts")
    }
}