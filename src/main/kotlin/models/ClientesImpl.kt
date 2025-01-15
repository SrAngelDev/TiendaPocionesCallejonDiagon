package srangeldev.models

class ClientesImpl(
    nombre: String,
    edad: Int,
    var rol: Rol) : Persona(nombre, edad)