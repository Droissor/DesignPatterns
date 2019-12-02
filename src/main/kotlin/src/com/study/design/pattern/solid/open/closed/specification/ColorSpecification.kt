package src.com.study.design.pattern.solid.open.closed.specification

import src.com.study.design.pattern.solid.open.closed.domain.Color
import src.com.study.design.pattern.solid.open.closed.domain.Product

class ColorSpecification(private val color: Color) : Specification<Product> {

    override fun isSatisfied(item: Product): Boolean = item.color == color

}