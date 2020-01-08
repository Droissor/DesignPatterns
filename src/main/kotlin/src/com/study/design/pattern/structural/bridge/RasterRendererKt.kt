package src.com.study.design.pattern.structural.bridge

class RasterRendererKt : RendererKt {
    override fun whatToRenderAs(): String = "pixels"
}