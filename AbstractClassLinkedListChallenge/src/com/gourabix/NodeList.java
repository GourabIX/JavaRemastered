package com.gourabix;

public interface NodeList {
    boolean addNode(NodeItem node);
    boolean removeNode(NodeItem node);
    NodeItem getNodeListRoot();
    void traverse(NodeItem root);
    boolean isListEmpty();
}
