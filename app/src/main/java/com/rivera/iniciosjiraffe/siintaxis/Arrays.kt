package com.rivera.iniciosjiraffe.siintaxis

fun main() {
    var diasSemana = arrayOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    println(diasSemana)

    for(posicion in diasSemana.indices) {
        println("1* -Posición: ${posicion}, Valor: ${diasSemana[posicion]}")
    }

    //Ya me da el valor esta manera
    for((posicion, valor) in diasSemana.withIndex()) {
        println("2* -Posición: ${posicion}, Valor: ${valor}")
    }

    for(valor in diasSemana) {
        println("3* $valor")
    }
}
