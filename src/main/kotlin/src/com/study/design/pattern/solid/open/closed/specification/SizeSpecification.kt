package src.com.study.design.pattern.solid.open.closed.specification

import src.com.study.design.pattern.solid.open.closed.domain.Product
import src.com.study.design.pattern.solid.open.closed.domain.Size

class SizeSpecification(private val size: Size) : Specification<Product> {

    override fun isSatisfied(item: Product): Boolean = item.size == size
}