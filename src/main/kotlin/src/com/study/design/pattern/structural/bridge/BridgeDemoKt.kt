package src.com.study.design.pattern.structural.bridge

class BridgeDemoKt

fun main() {
    println(TriangleKt(RasterRendererKt()).toString())
    println(TriangleKt(VectorRendererKt()).toString())
    println(SquareKt(RasterRendererKt()).toString())
    println(SquareKt(VectorRendererKt()).toString())
}