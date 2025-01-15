package srangeldev

import srangeldev.models.ClientesImpl
import srangeldev.models.ColeccionistaDeArtefactosMagicosImpl
import srangeldev.models.CuranderosDeSanMungoImpl
import srangeldev.models.EstudianteHowartsImpl
import srangeldev.models.MagosYBrujasImpl

fun main() {
    val estudiante = EstudianteHowartsImpl()
    val mago = MagosYBrujasImpl()
    val curandero = CuranderosDeSanMungoImpl()
    val coleccionista = ColeccionistaDeArtefactosMagicosImpl()

    val cliente1 = ClientesImpl("Harry Potter",  25, estudiante)

    if (cliente1.rol is EstudianteHowartsImpl) {
        (cliente1.rol as EstudianteHowartsImpl).comprarPociones()
        (cliente1.rol as EstudianteHowartsImpl).comprarMaterialesMagicos()
        (cliente1.rol as EstudianteHowartsImpl).comprarIngredientes()
    }

    println()
    //Cliente1 adopte el rol de mago
    cliente1.rol = mago

    if (cliente1.rol is MagosYBrujasImpl) {
        (cliente1.rol as MagosYBrujasImpl).comprarPociones()
        (cliente1.rol as MagosYBrujasImpl).comprarMaterialesMagicos()
        (cliente1.rol as MagosYBrujasImpl).buscarPocionesAvanzadas()
    }

    println()
    //Cliente1 como curandero
    cliente1.rol = curandero

    if (cliente1.rol is CuranderosDeSanMungoImpl) {
        (cliente1.rol as CuranderosDeSanMungoImpl).comprarPociones()
        (cliente1.rol as CuranderosDeSanMungoImpl).comprarMaterialesMagicos()
        (cliente1.rol as CuranderosDeSanMungoImpl).comprarRemediosMedicinales()
    }

    println()
    //Cliente1 como coleccionista
    cliente1.rol = coleccionista
    if (cliente1.rol is ColeccionistaDeArtefactosMagicosImpl) {
        (cliente1.rol as ColeccionistaDeArtefactosMagicosImpl).comprarPociones()
        (cliente1.rol as ColeccionistaDeArtefactosMagicosImpl).comprarMaterialesMagicos()
        (cliente1.rol as ColeccionistaDeArtefactosMagicosImpl).buscarObjetosRaros()
    }
}