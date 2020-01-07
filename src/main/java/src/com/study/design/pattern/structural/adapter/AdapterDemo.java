package src.com.study.design.pattern.structural.adapter;

public class AdapterDemo {

    public static void main(String[] args) {
        System.out.println(new SquareToRectangleAdapter(new Square(5)).getArea());
    }
}
