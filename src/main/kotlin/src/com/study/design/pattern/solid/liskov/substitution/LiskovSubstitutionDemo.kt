package src.com.study.design.pattern.solid.liskov.substitution

class LiskovSubstitutionDemo

fun main() {

    val rectangle = Rectangle(2, 3)
    predictRectangleArea(rectangle)

    val square = Square(5)
    predictRectangleArea(square)

}

fun predictRectangleArea(rectangle: Rectangle) {

    val width = rectangle.width

    /**Look that i want to treat the square like a rectangle, but i must respect
     * the square rules and i should't change only height or width */
    if (rectangle is Square) rectangle.setSize(10) else rectangle.height = 10

    println("Expected area of ${10 * width}, got ${rectangle.getArea()}")

}