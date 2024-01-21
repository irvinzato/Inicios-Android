package com.rivera.iniciosjiraffe.siintaxis

var variableDeLaClase: Int = 100

fun main() {
    println(formatoCadena("   Esta palabra es para probar") + " - " + variableDeLaClase)
    println(formatoCadenaCool("   Utilizamos la funcion Cool  ") + " - " + variableDeLaClase)
}

fun formatoCadena(palabra: String): String {
    println("Dentro de la función: $variableDeLaClase")
    return palabra.replace("a", "Irving").trim();
}

fun formatoCadenaCool(palabra: String): String = palabra.replace("a", "Irving").trim()