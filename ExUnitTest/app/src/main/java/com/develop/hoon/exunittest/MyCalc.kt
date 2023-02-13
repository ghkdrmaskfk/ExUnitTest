package com.develop.hoon.exunittest

class MyCalc: Calculations() {
    private val pi = 3.14

    override fun calculatePlus(radius: Double): Double {
        return pi + radius
    }

    override fun calculateMinus(radius: Double): Double {
        return pi - radius
    }
}