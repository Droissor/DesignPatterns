package src.com.study.design.pattern.solid.open.closed.specification

class AndSpecification<T>(private val firstSpec: Specification<T>, private val secondSpec: Specification<T>) : Specification<T> {

    override fun isSatisfied(item: T): Boolean = firstSpec.isSatisfied(item) && secondSpec.isSatisfied(item)
}