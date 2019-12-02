package src.com.study.design.pattern.solid.open.closed

import src.com.study.design.pattern.solid.open.closed.domain.Color
import src.com.study.design.pattern.solid.open.closed.domain.Product
import src.com.study.design.pattern.solid.open.closed.domain.Size
import src.com.study.design.pattern.solid.open.closed.filter.BetterFilter
import src.com.study.design.pattern.solid.open.closed.filter.ProductFilter
import src.com.study.design.pattern.solid.open.closed.specification.AndSpecification
import src.com.study.design.pattern.solid.open.closed.specification.ColorSpecification
import src.com.study.design.pattern.solid.open.closed.specification.SizeSpecification

class OpenClosedDemo

fun main() {

    val apple = Product("Apple", Size.SMALL, Color.GREEN)
    val tree = Product("Tree", Size.LARGE, Color.GREEN)
    val house = Product("House", Size.LARGE, Color.BLUE)

    val products = listOf(apple, tree, house)

    printGreenProductsOldImplementation(products)

    printGreenProducts(products)
    printLargeProducts(products)
    printLargeBlueProducts(products)

}

fun printLargeBlueProducts(products: List<Product>) {
    println("\nLarge Blue products:")
    val specification = AndSpecification(ColorSpecification(Color.BLUE), SizeSpecification(Size.LARGE))
    BetterFilter().filter(products, specification).forEach { println(it) }
}

fun printLargeProducts(products: List<Product>) {
    println("\nLarge products:")
    BetterFilter().filter(products, SizeSpecification(Size.LARGE)).forEach { println(it) }
}

fun printGreenProducts(products: List<Product>) {
    println("\nGreen products (new):")
    BetterFilter().filter(products, ColorSpecification(Color.GREEN)).forEach { println(it) }
}

fun printGreenProductsOldImplementation(products: List<Product>) {
    println("\nGreen products (old):")
    ProductFilter().filterByColor(products, Color.GREEN).forEach { println(it) }
}