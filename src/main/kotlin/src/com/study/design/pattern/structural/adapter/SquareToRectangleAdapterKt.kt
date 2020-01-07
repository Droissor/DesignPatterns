package src.com.study.design.pattern.structural.adapter

class SquareToRectangleAdapterKt(private val squareKt: SquareKt) : RectangleKt {

    override fun getWidth(): Int = squareKt.side

    override fun getHeight(): Int = squareKt.side
}