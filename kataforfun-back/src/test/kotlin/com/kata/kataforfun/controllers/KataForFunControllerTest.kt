package com.kata.kataforfun.controllers

import com.kata.kataforfun.services.FOR
import com.kata.kataforfun.services.KATA
import com.kata.kataforfun.services.KataForFunService
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.MockMvcBuilders

@ExtendWith(MockitoExtension::class)
class KataForFunControllerTest {

    @Mock
    private lateinit var kataForFunService: KataForFunService

    @InjectMocks
    private lateinit var kataForFunController: KataForFunController

    private lateinit var mockMvc: MockMvc

    @BeforeEach
    fun setup(){
        mockMvc = MockMvcBuilders.standaloneSetup(kataForFunController).build()
    }
    @Test
    fun test_convert_number_success() {
        val inputNumber = 53
        val expected = FOR + KATA

        Mockito.`when`(kataForFunService.convertNumber(inputNumber)).thenReturn(expected)
        mockMvc.perform(get("/kata-for-fun/{inputNumber}", inputNumber))
                .andExpect(status().isOk)
                .andExpect(jsonPath("$.result").value(expected))
    }

}