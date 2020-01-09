package src.com.study.design.pattern.structural.decorator.draconid

import src.com.study.design.pattern.structural.decorator.WingedBeast

class Wyvern : Draconid {
    private val wingedBeast = WingedBeast()

    override fun info() = """
        Wyvern: ${super.info()}  
                ${wingedBeast.info()}
                Have deadly poison.
    """.trimIndent()
}