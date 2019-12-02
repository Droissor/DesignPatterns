package src.com.study.design.pattern.solid.open.closed.filter

import src.com.study.design.pattern.solid.open.closed.domain.Product
import src.com.study.design.pattern.solid.open.closed.specification.Specification

class BetterFilter : Filter<Product> {

    override fun filter(items: List<Product>, specification: Specification<Product>) = items.filter { specification.isSatisfied(it) }

}