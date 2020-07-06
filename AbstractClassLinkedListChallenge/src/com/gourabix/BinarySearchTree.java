package com.gourabix;

public class BinarySearchTree implements NodeList {
    private NodeItem root = null;

    public BinarySearchTree(NodeItem root) {
        this.root = root;
    }

    @Override
    public boolean addNode(NodeItem newItem) {
        if (newItem != null) {
            if (this.root == null) {
                // the BST is empty. So the newItem becomes the Head of the tree.
                this.root = newItem;
                return true;
            }

            NodeItem currentNode = this.root;
            while (currentNode != null) {
                int comparison = currentNode.compareValue(newItem);

                if (comparison < 0) {
                    // 'this' item is smaller than the newItem. So add the newItem to the right.
                    if (currentNode.next() != null) {
                        // keep traversing (recursively) the right sub-tree
                        currentNode = currentNode.next();
                    } else {
                        // there's no node to the right, so add the item at this point
                        currentNode.setNext(newItem);
                        return true;
                    }
                } else if (comparison > 0) {
                    // 'this' item is greater than the newItem. So add the newItem to the left.
                    if (currentNode.previous() != null) {
                        // keep traversing (recursively) the left sub-tree
                        currentNode = currentNode.previous();
                    } else {
                        // there's no node to the left, so add the item at this point
                        currentNode.setPrevious(newItem);
                        return true;
                    }
                } else {
                    // a node with the same value already exists. Do not add.
                    System.out.println("The value: " + currentNode.getValue() + " already exists.");
                    return false;
                }
            }
        }

        return false;
    }

    @Override
    public boolean removeNode(NodeItem deleteItem) {
        NodeItem currentNode = this.root;
        NodeItem parentNode = currentNode;

        while (currentNode != null) {
            int comparison = currentNode.compareValue(deleteItem);
            if (comparison < 0) {
                // currentNode is smaller than deleteItem; go right
                parentNode = currentNode;
                currentNode = currentNode.next();
            } else if (comparison > 0) {
                // currentNode is greater than deleteItem; go left
                parentNode = currentNode;
                currentNode = currentNode.previous();
            } else {
                // found the item to remove
                performRemoval(currentNode, parentNode);
                return true;
            }
        }

        return false;
    }

    private void performRemoval(NodeItem currentNode, NodeItem parentNode) {
        // remove currentNode from the tree
        if (currentNode.next() == null) {
            // no right tree, so make parentNode point to left tree (which may be null)
            if (parentNode.next() == currentNode) {
                // currentNode is right child of its parentNode
                parentNode.setNext(currentNode.previous());
            } else if (parentNode.previous() == currentNode) {
                // currentNode is left child of its parentNode
                parentNode.setPrevious(currentNode.previous());
            } else {
                // parentNode must be currentNode, which means we were looking at the root of the tree
                this.root = currentNode.previous();
            }
        } else if (currentNode.previous() == null) {
            // no left tree, so make parentNode point to right tree (which may be null)
            if (parentNode.next() == currentNode) {
                // currentNode is right child of its parentNode
                parentNode.setNext(currentNode.next());
            } else if (parentNode.previous() == currentNode) {
                // currentNode is left child of its parentNode
                parentNode.setPrevious(currentNode.next());
            } else {
                // again, we are deleting the root
                this.root = currentNode.next();
            }
        } else {
            // neither left nor right are null, deletion is now a lot trickier!
            // From the right sub-tree, find the smallest value (i.e., the leftmost).
            NodeItem current = currentNode.next();
            NodeItem leftmostParent = currentNode;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }
            // Now put the smallest value into our node to be deleted
            currentNode.setValue(current.getValue());
            // and delete the smallest
            if (leftmostParent == currentNode) {
                // there was no leftmost node, so 'current' points to the smallest
                // node (the one that must now be deleted).
                currentNode.setNext(current.next());
            } else {
                // set the smallest node's parentNode to point to
                // the smallest node's right child (which may be null).
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public NodeItem getNodeListRoot() {
        return root;
    }

    @Override
    public void traverse(NodeItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }

    @Override
    public boolean isListEmpty() {
        return getNodeListRoot() == null;
    }
}
