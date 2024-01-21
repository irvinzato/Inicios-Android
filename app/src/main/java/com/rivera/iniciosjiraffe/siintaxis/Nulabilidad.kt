package com.rivera.iniciosjiraffe.siintaxis

fun main() {
    var nombre: String = "Irving"
    //Kotlin tiene seguridad ante nulos
    var nombreNulo: String? = null

    println(nombreNulo)
    println(nombre!![3]) //con "!!" digo, ESTOY SEGURO QUE NO SERA NULO
    println(nombreNulo?.get(3) ?:"Es nulo") //con "!!" digo, ESTOY SEGURO QUE NO SERA NULO
}