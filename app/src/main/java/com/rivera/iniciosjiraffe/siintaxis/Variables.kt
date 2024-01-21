package com.rivera.iniciosjiraffe.siintaxis

fun main() {
    var edad: Int = 27
    var edadLong: Long = 27
    var edadFloat: Float = 27.9f
    var edadDouble: Double = 27.99999

    val cadecaChar: Char = 'I'
    val cadena: String = "Irving"

    val boleano: Boolean = true

    println("Suma de entero y float: " + (edad + edadFloat.toInt()))
    println("Hola me llamo $cadena y tengo $edad años")

    println("Siempre adelante Irving")
    println(sumaNumeros(100, 50))
}

fun sumaNumeros(numero1: Int, numero2: Int): Int {
    return numero1 + numero2
}