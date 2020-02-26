package src.com.study.design.pattern.behavioral.Iterator;

import java.util.Iterator;

class PreOrderIterator<T> implements Iterator<Node<T>> {

    private Node<T> current, root;

    public PreOrderIterator(Node<T> root) {
        this.root = current = root;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Node<T> next() {

        root = current;

        if (current.left != null) {
            current = current.left;
        } else if (current.right != null) {
            current = current.right;
        } else {
            current = getMostRightParentChild(current);
        }

        return root;
    }

    private Node<T> getMostRightParentChild(Node<T> node) {
        if (node.parent == null)
            return null;
        else if (node.parent.right != null && node.parent.right != node) {
            return node.parent.right;
        } else {
            return getMostRightParentChild(node.parent);
        }
    }
}