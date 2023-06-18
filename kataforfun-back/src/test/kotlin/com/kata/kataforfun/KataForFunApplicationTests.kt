package com.kata.kataforfun

import com.kata.kataforfun.services.FOR
import com.kata.kataforfun.services.KATA
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@ExtendWith(SpringExtension::class)
@AutoConfigureMockMvc
@SpringBootTest
class KataForFunApplicationTests {

    @Autowired
    private lateinit var mockMvc: MockMvc
    @Test
    fun test_convert_number_success() {
        val inputNumber = 53
        val expected = FOR + KATA

        mockMvc.perform(MockMvcRequestBuilders.get("/kata-for-fun/{inputNumber}", inputNumber))
                .andExpect(MockMvcResultMatchers.status().isOk)
                .andExpect(MockMvcResultMatchers.jsonPath("$.result").value(expected))
    }

}
