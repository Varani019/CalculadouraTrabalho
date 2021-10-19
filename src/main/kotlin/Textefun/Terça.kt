package Textefun

import projeto.SomaDosDias

fun main() {
    val Terça = SomaDosDias(
        Renda = 60,
        Gasto = 5)
    val ResultadoTerça = Terça.Renda -  Terça.Gasto

    println("renda = ${Terça.Renda}  \ngasto = ${Terça.Gasto}  \nresultado = $ResultadoTerça")
}