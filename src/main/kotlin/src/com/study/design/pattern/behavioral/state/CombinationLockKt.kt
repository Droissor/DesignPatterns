package src.com.study.design.pattern.behavioral.state

import java.util.Arrays

class CombinationLockKt(combination: IntArray) {

    private val combination: String
    var status = "LOCKED"

    init {
        val stringBuilder = StringBuilder()
        Arrays.stream(combination).forEach {stringBuilder.append(it) }
        this.combination = stringBuilder.toString()
    }

    fun enterDigit(digit: Int) {
        if (status == "LOCKED") status = ""

        status += digit

        if (status == combination) status = "OPEN"

        if (status != "OPEN" && status.length == combination.length) status = "ERROR"

        println(status)
    }
}