package com.rivera.iniciosjiraffe.siintaxis

fun main() {
    getMonth(124)
    println("Esta función regresa una cadena: " + getTrimester(3))
    getBimester(15)
    recibeCualquierValor(100)
}

fun getMonth(month: Int) {
    when(month) {
        1 -> println("ENERO")
        2 -> println("FEBRERO")
        3 -> println("MARZO")
        4 -> println("ABRIL")
        5 -> {
            println("MAYO")
            println("Puedo hacer mas cosas")
        }
        6 -> println("JUNIO")
        7 -> println("JULIO")
        8 -> println("AGOSTO")
        9 -> println("SEPTIEMBRE")
        10 -> println("OCTUBRE")
        11 -> println("NOVIEMBRE")
        12 -> println("DICIEMBRE")
        else -> println("EL MES NO ES VALIDO")
    }
}

fun getTrimester(month: Int): String {
    return when(month) {
        1, 2, 3 -> "Primer trimestre"
        4, 5, 6 -> "Segundo trimestre"
        7, 8, 9 -> "Tercer trimestre"
        10, 11, 12 -> "Cuarto trimestre"
        else -> "El mes no pertenece a ningun trimestre"
    }
}

fun dameTrimestreReducido(month: Int): String = when(month) {
        1, 2, 3 -> "Primer trimestre"
        4, 5, 6 -> "Segundo trimestre"
        7, 8, 9 -> "Tercer trimestre"
        10, 11, 12 -> "Cuarto trimestre"
        else -> "El mes no pertenece a ningun trimestre"
    }


fun getBimester(month: Int) {
    when(month) {
        in 1..6 -> println("Primer bimestre")
        in 7..12 -> println("Segundo bimestre")
        !in 1..12 -> println("El mes no pertenece a ningun bimestre")
    }
}

fun recibeCualquierValor(value: Any) {
    when(value){
        is Int -> println(value + value)
        is String -> println("Es un entero")
        is Boolean -> if(value) println("Es verdadero")
        else print("No es ninguno de los objetos controlados")
    }
}