package src.com.study.design.pattern.structural.bridge;

class RasterRenderer implements Renderer {

    @Override
    public String whatToRenderAs() {
        return "pixels";
    }
}
