package src.com.study.design.pattern.structural.bridge

abstract class ShapeKt(private val rendererKt: RendererKt) {
    abstract fun getName(): String

    override fun toString() = "Drawing ${getName()} as ${rendererKt.whatToRenderAs()}"
}