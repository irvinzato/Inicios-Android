package com.rivera.iniciosjiraffe.siintaxis

fun main() {
    listasInmutables()
    listasMutables()
}

fun listasInmutables() {
    println("=== LISTAS INMUTABLES ===")
    val soloLectura: List<String> = listOf("Zeus","Shiva","Odin","Hades")
    println("$soloLectura tiene tamaño ${soloLectura.size}")
    println("${soloLectura[0]}")
    println("${soloLectura.last()}")
    println("${soloLectura.first()}")

    val ejemplo = soloLectura.filter { it.contains("a") }
    println("El ejemplo con filter contiene ${ejemplo}")

    //Si no me gusta poner el "it" puedo cambiarle el nombre de esta manera
    soloLectura.forEach { iteracion -> println("Le cambie el nombre a it $iteracion") }
}

fun listasMutables() {
    println("=== LISTAS MUTABLES ===")
    var listaMutable: MutableList<String> = mutableListOf("Lubu","Mulan","Leonidas","Aguiles")
    println(listaMutable)

    listaMutable.add(0,"Jack el destripador")
    println(listaMutable)

    if(listaMutable.isEmpty()){
        println("No hay elementos en la lista")
    }
    if(listaMutable.isNotEmpty()) {
        println("Si tiene valores la lista")
    }

    listaMutable.forEach { it }

    println(listaMutable)
}