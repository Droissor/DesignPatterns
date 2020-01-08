package src.com.study.design.pattern.structural.bridge;

class Triangle extends Shape {

    Triangle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}
