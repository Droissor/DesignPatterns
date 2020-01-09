package src.com.study.design.pattern.structural.decorator

import src.com.study.design.pattern.structural.decorator.draconid.DragonKt
import src.com.study.design.pattern.structural.decorator.draconid.Drake
import src.com.study.design.pattern.structural.decorator.draconid.Wyrm
import src.com.study.design.pattern.structural.decorator.draconid.Wyvern

/**
 * Since I didn't like the exercise, I created my own decorator in Kotlin
 */
class DecoratorDemoKt

fun main() {
    println(Wyrm().info())
    println(Drake().info())
    println(Wyvern().info())
    println(DragonKt().info())
}