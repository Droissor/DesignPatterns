package src.com.study.design.pattern.structural.bridge;

abstract class Shape {
    Renderer renderer;

    Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract String getName();

    @Override
    public String toString() { return "Drawing " + getName() + " as " + renderer.whatToRenderAs(); }
}