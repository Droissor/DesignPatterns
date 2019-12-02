package src.com.study.design.pattern.solid.open.closed.filter

import src.com.study.design.pattern.solid.open.closed.domain.Color
import src.com.study.design.pattern.solid.open.closed.domain.Product
import src.com.study.design.pattern.solid.open.closed.domain.Size

/**
 * For every new criteria, this class must be changed.
 */
class ProductFilter {

    fun filterByColor(products: List<Product>, color: Color) = products.filter { it.color == color }

    fun filterBySize(products: List<Product>, size: Size) = products.filter { it.size == size }

    fun filterBySizeAndColor(products: List<Product>, size: Size, color: Color) =
        products.filter { it.size == size && it.color == color }

}