package oop.ch.keepcalm.util.use

import oop.ch.keepcalm.util.Temperature
import oop.ch.keepcalm.util.unitsSupported

fun main() {
    println(unitsSupported())
    println(Temperature.f2c(75.253))
    println(Temperature.c2f(24.305))
}