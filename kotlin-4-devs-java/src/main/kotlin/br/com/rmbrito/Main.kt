package br.com.rmbrito

fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Kotlin World"
    println("Hello, $name 🙂 !!!")
}