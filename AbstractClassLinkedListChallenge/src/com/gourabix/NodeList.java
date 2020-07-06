package com.gourabix;

public interface NodeList {
    boolean addNode(NodeItem newItem);
    boolean removeNode(NodeItem deleteItem);
    NodeItem getNodeListRoot();
    void traverse(NodeItem root);
    boolean isListEmpty();
}
