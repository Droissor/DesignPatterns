package src.com.study.design.pattern.structural.adapter

class AdapterDemoKt

fun main() {

    println(SquareToRectangleAdapterKt(SquareKt(5)).getArea())

}