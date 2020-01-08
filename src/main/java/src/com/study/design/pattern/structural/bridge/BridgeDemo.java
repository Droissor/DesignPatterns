package src.com.study.design.pattern.structural.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        System.out.println(new Triangle(new RasterRenderer()).toString());
        System.out.println(new Triangle(new VectorRenderer()).toString());
        System.out.println(new Square(new RasterRenderer()).toString());
        System.out.println(new Square(new VectorRenderer()).toString());
    }
}
