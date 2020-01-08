package src.com.study.design.pattern.structural.bridge

class TriangleKt(rendererKt: RendererKt) : ShapeKt(rendererKt) {
    override fun getName() = "Triangle"
}