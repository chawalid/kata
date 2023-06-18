package com.kata.kataforfun.services

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class KataForFunServiceTest{

    private lateinit var kataForFunService: KataForFunService

    @BeforeEach
    fun setup() {
        kataForFunService = KataForFunService()
    }

    @Test
    fun should_return_same_string_if_no_match() {
        val inputNumber = 1
        val expected = "1"

        val result = kataForFunService.convertNumber(inputNumber)

        assertEquals(expected, result)
    }
    @Test
    fun should_convert_number_when_divisible_by_three() {
        val inputNumber = 9
        val expected = KATA

        val result = kataForFunService.convertNumber(inputNumber)

        assertEquals(expected, result)
    }

    @Test
    fun should_convert_number_when_contains_three() {
        val inputNumber = 13
        val expected = KATA

        val result = kataForFunService.convertNumber(inputNumber)

        assertEquals(expected, result)
    }

    @Test
    fun should_convert_number_when_divisible_by_three_and_contains_three() {
        val inputNumber = 3
        val expected = KATA + KATA

        val result = kataForFunService.convertNumber(inputNumber)

        assertEquals(expected, result)
    }

    @Test
    fun should_convert_number_when_divisible_by_three_and_contains_five() {
        val inputNumber = 51
        val expected = KATA + FOR

        val result = kataForFunService.convertNumber(inputNumber)

        assertEquals(expected, result)
    }

    @Test
    fun should_convert_number_when_divisible_by_three_and_contains_seven() {
        val inputNumber = 27
        val expected = KATA + FUN

        val result = kataForFunService.convertNumber(inputNumber)

        assertEquals(expected, result)
    }

    @Test
    fun should_convert_number_when_divisible_by_three_and_contains_five_and_seven() {
        val inputNumber = 57
        val expected = KATA + FOR + FUN

        val result = kataForFunService.convertNumber(inputNumber)

        assertEquals(expected, result)
    }

    @Test
    fun should_convert_number_when_divisible_by_three_and_contains_three_and_five_and_seven() {
        val inputNumber = 357
        val expected = KATA + KATA + FOR + FUN

        val result = kataForFunService.convertNumber(inputNumber)

        assertEquals(expected, result)
    }

    @Test
    fun should_convert_number_when_divisible_by_five() {
        val inputNumber = 10
        val expected = FOR

        val result = kataForFunService.convertNumber(inputNumber)

        assertEquals(expected, result)
    }

    @Test
    fun should_convert_number_when_contains_five() {
        val inputNumber = 52
        val expected = FOR

        val result = kataForFunService.convertNumber(inputNumber)

        assertEquals(expected, result)
    }

    @Test
    fun should_convert_number_when_divisible_by_five_and_contains_five() {
        val inputNumber = 25
        val expected = FOR + FOR

        val result = kataForFunService.convertNumber(inputNumber)

        assertEquals(expected, result)
    }

    @Test
    fun should_convert_number_when_contains_seven() {
        val inputNumber = 17
        val expected = FUN

        val result = kataForFunService.convertNumber(inputNumber)

        assertEquals(expected, result)
    }

    @Test
    fun should_convert_number_when_contains_three_and_five() {
        val inputNumber = 53
        val expected = FOR + KATA

        val result = kataForFunService.convertNumber(inputNumber)

        assertEquals(expected, result)
    }

    @Test
    fun should_convert_number_when_contains_three_and_seven() {
        val inputNumber = 37
        val expected = KATA + FUN

        val result = kataForFunService.convertNumber(inputNumber)

        assertEquals(expected, result)
    }

    @Test
    fun should_convert_number_when_contains_five_and_seven() {
        val inputNumber = 517
        val expected = FOR + FUN

        val result = kataForFunService.convertNumber(inputNumber)

        assertEquals(expected, result)
    }

    @Test
    fun should_convert_number_when_divisible_by_Three_and_contains_three_and_five() {
        val inputNumber = 351
        val expected = KATA + KATA + FOR

        val result = kataForFunService.convertNumber(inputNumber)

        assertEquals(expected, result)
    }
    @Test
    fun should_convert_number_when_divisible_by_five_and_contains_three_and_five() {
        val inputNumber = 35
        val expected = FOR + KATA + FOR

        val result = kataForFunService.convertNumber(inputNumber)

        assertEquals(expected, result)
    }

}