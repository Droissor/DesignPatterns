package src.com.study.design.pattern.solid.open.closed.specification

interface Specification<T> {

    fun isSatisfied(item: T): Boolean

}