package com.gourabix;

public abstract class NodeItem {
    protected NodeItem prevLink = null;
    protected NodeItem nextLink = null;
    protected Object value;

    public NodeItem(Object value) {
        this.value = value;
    }

    public abstract NodeItem previous();
    public abstract NodeItem setPrevious(NodeItem nodeItem);
    public abstract NodeItem next();
    public abstract NodeItem setNext(NodeItem nodeItem);
    public abstract int compareValue(NodeItem nodeItem);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
