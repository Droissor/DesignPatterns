package src.com.study.design.pattern.structural.decorator.draconid

import src.com.study.design.pattern.structural.decorator.MythicalBeast

interface Draconid : MythicalBeast {
    override fun info() = "A large semi-reptile with intelligence above other mythical beasts."
}