package src.com.study.design.pattern.behavioral.iterator

class IteratorDemoKt

fun main(){

    //   1
    //  / \
    // 2   3

    val root = NodeKt(1, NodeKt(2), NodeKt(3))

    val iterator = root.preOrder()

    while (iterator.hasNext()) {
        print("" + iterator.next().value + ",")
    }
    println()

    //          a
    //         / \
    //        b   [
    //       / \ / \
    //      c  d e  ]

    val rootChar =
        NodeKt(
            'a',
            NodeKt(
                'b',
                NodeKt('c'),
                NodeKt('d')
            ),
            NodeKt(
                '[',
                NodeKt('e'),
                NodeKt(']')
            )
        )

    val iteratorChar = rootChar.preOrder()

    while (iteratorChar.hasNext()) {
        print("" + iteratorChar.next().value + ",")
    }
    println()
}