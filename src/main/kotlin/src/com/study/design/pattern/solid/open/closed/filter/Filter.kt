package src.com.study.design.pattern.solid.open.closed.filter

import src.com.study.design.pattern.solid.open.closed.specification.Specification

interface Filter<T> {

    fun filter(items: List<T>, specification: Specification<T>): List<T>

}