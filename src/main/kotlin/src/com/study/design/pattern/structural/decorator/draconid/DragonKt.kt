package src.com.study.design.pattern.structural.decorator.draconid

import src.com.study.design.pattern.structural.decorator.FourLegsBeast
import src.com.study.design.pattern.structural.decorator.WingedBeast

class DragonKt : Draconid {

    private val wingedBeast = WingedBeast()

    private val fourLegsBeast = FourLegsBeast()

    override fun info() = """
        Dragon: ${super.info()}  
                ${wingedBeast.info()}  
                ${fourLegsBeast.info()}
                Have enough intelligence to conversation.
                Capable to breathe fire.
    """.trimIndent()
}