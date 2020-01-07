package src.com.study.design.pattern.structural.adapter

interface RectangleKt {

    fun getWidth(): Int

    fun getHeight(): Int

    fun getArea() = getHeight() * getWidth()
}