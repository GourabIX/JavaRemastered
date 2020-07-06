package com.gourabix;

public class NodeListImpl implements NodeList {
    private NodeItem root = null;

    public NodeListImpl(NodeItem root) {
        this.root = root;
    }

    @Override
    public boolean addNode(NodeItem newItem) {
        // if the list is completely empty
        if (root == null) {
            newItem.setNext(null);
            newItem.setPrevious(null);
            root = newItem;
            return true;
        }

        NodeItem currentNode = root;

        while (currentNode != null) {
            int comparison = currentNode.compareValue(newItem);

            if (comparison < 0) {
                // if 'this' node is smaller than the arg node
                if (currentNode.next() != null) {
                    currentNode = currentNode.next();
                } else {
                    currentNode.setNext(newItem);
                    newItem.setPrevious(currentNode);
                    newItem.setNext(null);
                    return true;
                }
            } else if (comparison > 0) {
                // if 'this' node is greater than the arg node
                if (currentNode.previous() != null) {
                    currentNode.previous().setNext(newItem);
                    newItem.setPrevious(currentNode.previous());
                    currentNode.setPrevious(newItem);
                    newItem.setNext(currentNode);
                } else {
                    currentNode.setPrevious(newItem);
                    newItem.setNext(currentNode);
                    newItem.setPrevious(null);
                    root = newItem;
                }
                return true;
            } else {
                // if 'this' node is equal to the arg node
                System.out.println("An object with value: " + newItem.getValue() + " already exists!");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeNode(NodeItem deleteItem) {
        if (deleteItem != null) {
            // traverse and find the nodeItem to delete.
            NodeItem currentNode = getNodeListRoot();
            while (currentNode != null) {
                int comparison = currentNode.compareValue(deleteItem);
                if (comparison < 0) {
                    // move to the next node.
                    currentNode = currentNode.next();
                } else if (comparison > 0) {
                    // deleteItem does not exist in the NodeList. Abort Mission.
                    System.out.println("No node with value: " + deleteItem.getValue() + " was found.");
                    return false;
                } else if (comparison == 0){
                    // found node to be deleted. Proceed with deletion.
                    if (getNodeListRoot() == currentNode) {
                        // Case: HEAD node
                        root = root.next();
                        if (root != null) {
                            // check if this was the last node in the Linked List
                            root.setPrevious(null);
                        }
                        return true;
                    } else if (currentNode.next() == null) {
                        // Case: TAIL node
                        currentNode.previous().setNext(null);
                        return true;
                    } else {
                        // Case: Literally any other node
                        if (currentNode.previous() != null && currentNode.next() != null) {
                            currentNode.previous().setNext(currentNode.next());
                            currentNode.next().setPrevious(currentNode.previous());
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    @Override
    public NodeItem getNodeListRoot() {
        return root;
    }

    @Override
    public void traverse(NodeItem root) {
        if (root == null) {
            System.out.println("The Linked List is empty. Add some items to get started!");
        } else {
            System.out.println("Contents of the Linked List are as follows: ");
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }

    @Override
    public boolean isListEmpty() {
        if (getNodeListRoot() == null) {
            return true;
        }

        return false;
    }
}
