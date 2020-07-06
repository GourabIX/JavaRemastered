package com.gourabix;

public class Node extends NodeItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    public NodeItem previous() {
        return prevLink;
    }

    @Override
    public NodeItem setPrevious(NodeItem nodeItem) {
        this.prevLink = nodeItem;
        return this.prevLink;
    }

    @Override
    public NodeItem next() {
        return nextLink;
    }

    @Override
    public NodeItem setNext(NodeItem nodeItem) {
        this.nextLink = nodeItem;
        return this.nextLink;
    }

    @Override
    public int compareValue(NodeItem nodeItem) {
        if (nodeItem != null) {
            return ((String) this.value).compareTo((String) nodeItem.value);
        }

        return -1;
    }
}
