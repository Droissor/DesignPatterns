package src.com.study.design.pattern.structural.bridge;

class Square extends Shape {

    Square(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String getName() {
        return "Square";
    }
}
