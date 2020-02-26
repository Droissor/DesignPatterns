package src.com.study.design.pattern.behavioral.iterator


class PreOrderIteratorKt<T>(private var root: NodeKt<T>) : Iterator<NodeKt<T>> {

    private var current: NodeKt<T>?

    init {
        current = root
    }

    override fun hasNext(): Boolean {
        return current != null
    }

    override fun next(): NodeKt<T> {

        root = current!!

        current = when {
            current?.left != null -> {
                current!!.left
            }
            current?.right != null -> {
                 current!!.right
            }
            else -> {
                getMostRightParentChild(current)
            }
        }

        return root
    }

    private fun getMostRightParentChild(NodeKt: NodeKt<T>?): NodeKt<T>? {
        return if (NodeKt?.parent == null)
            null
        else if (NodeKt.parent?.right != null && NodeKt.parent?.right !== NodeKt) {
            NodeKt.parent?.right
        } else {
            getMostRightParentChild(NodeKt.parent)
        }
    }
}