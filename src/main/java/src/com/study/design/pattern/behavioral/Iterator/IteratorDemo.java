package src.com.study.design.pattern.behavioral.Iterator;

import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {

        //   1
        //  / \
        // 2   3

        Node<Integer> root = new Node<>(1,
                new Node<>(2),
                new Node<>(3));

        Iterator<Node<Integer>> iterator = root.preOrder();

        while (iterator.hasNext())
        {
            System.out.print("" + iterator.next().value + ",");
        }
        System.out.println();

        //          a
        //         / \
        //        b   [
        //       / \ / \
        //      c  d e  ]

        Node<Character> rootChar =
                new Node<>('a',
                        new Node<>('b', new Node<>('c'), new Node<>('d')),
                        new Node<>('[', new Node<>('e'), new Node<>(']'))
                );

        Iterator<Node<Character>> iteratorChar = rootChar.preOrder();

        while (iteratorChar.hasNext())
        {
            System.out.print("" + iteratorChar.next().value + ",");
        }
        System.out.println();

    }
}
