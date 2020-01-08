package src.com.study.design.pattern.structural.composite

import java.util.Collections

class SingleValueKt(private val value: Int) : ValueContainerKt {
    override fun iterator(): Iterator<Int> = Collections.singleton(value).iterator()
}