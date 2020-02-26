package src.com.study.design.pattern.behavioral.iterator

class NodeKt<T>(val value: T, val left: NodeKt<T>? = null, val right: NodeKt<T>? = null) {

    var parent: NodeKt<T>? = null

    init {
        left?.parent = this
        right?.parent = this
    }

    fun preOrder(): Iterator<NodeKt<T>> {
        return PreOrderIteratorKt(this)
    }
}

