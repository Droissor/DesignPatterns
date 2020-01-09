package src.com.study.design.pattern.structural.decorator.draconid

import src.com.study.design.pattern.structural.decorator.FourLegsBeast

class Drake : Draconid {
    private val fourLegsBeast = FourLegsBeast()

    override fun info() = """
        Drake:  ${super.info()}
                ${fourLegsBeast.info()}
    """.trimIndent()
}