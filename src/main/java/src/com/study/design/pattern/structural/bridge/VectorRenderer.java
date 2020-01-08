package src.com.study.design.pattern.structural.bridge;

class VectorRenderer implements Renderer {

    @Override
    public String whatToRenderAs() { return "lines"; }
}
