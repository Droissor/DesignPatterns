package src.com.study.design.pattern.creational.prototype

class PrototypeDemoKt

fun main() {

    val line = LineKt(PointKt(5, 0), PointKt(0, 5) )

    val otherLine = line.deepCopy()

    otherLine.end = PointKt(10, 10)

    println(line)
    println(otherLine)

}