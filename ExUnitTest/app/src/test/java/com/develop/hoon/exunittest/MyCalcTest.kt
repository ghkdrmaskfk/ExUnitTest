package com.develop.hoon.exunittest

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class MyCalcTest {
    private lateinit var myCalc: MyCalc

    @Before
    fun setUp() {
        myCalc = MyCalc()
    }

    @Test
    fun calculatePlus() {
        val result = myCalc.calculatePlus(2.4)
        assertThat(result).isEqualTo(5.54)
    }

    @Test
    fun calculateMinus() {
        val result = myCalc.calculateMinus(1.2345)
        assertThat(result).isEqualTo(1.9055000000000002)
    }
}