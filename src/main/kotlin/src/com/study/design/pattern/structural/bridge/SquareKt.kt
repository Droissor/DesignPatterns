package src.com.study.design.pattern.structural.bridge

class SquareKt(rendererKt: RendererKt) : ShapeKt(rendererKt) {
    override fun getName() = "Square"
}