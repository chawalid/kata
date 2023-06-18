package com.kata.kataforfun.services

import org.springframework.stereotype.Service

const val KATA = "Kata"
const val FOR = "For"
const val FUN = "Fun"

@Service
class KataForFunService {

    fun convertNumber(inputNumber: Int): String {
        val numberStr = inputNumber.toString()

        if (!isDivisibleByThree(inputNumber) && !isDivisibleByFive(inputNumber) && !numberStr.contains("3")
                && !numberStr.contains("5") && !numberStr.contains("7")) {
            return numberStr
        }

        val result = StringBuilder()
        if (isDivisibleByThree(inputNumber)) {
            result.append(KATA)
        }
        if (isDivisibleByFive(inputNumber)) {
            result.append(FOR)
        }

        for(c in numberStr.toCharArray()){
            when(c){
                '3' -> result.append(KATA)
                '5' -> result.append(FOR)
                '7' -> result.append(FUN)
            }
        }
        return result.toString()
    }

    private fun isDivisibleByFive(inputNumber: Int) = inputNumber % 5 == 0

    private fun isDivisibleByThree(inputNumber: Int) = inputNumber % 3 == 0

}