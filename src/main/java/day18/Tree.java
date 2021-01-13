package day18;

public class Tree {
    private Node root;

    public void insert(int value) {
        Node current = root;
        Node parent;

        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
        } else {

            while (true) {
                parent = current;

                if (value < current.getValue()) {
                    current = current.getLeftChild();

                    if (current == null) {
                        parent.setLeftChild(newNode);
                        return;
                    }
                } else {
                    current = current.getRightChild();
                    if (current == null) {
                        parent.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    }

    public void dfs(Node current) {
        if (current != null) {
            dfs(current.getLeftChild());
            System.out.print(current.getValue() + " ");
            dfs(current.getRightChild());
        }
    }

    public Node getRoot() {
        return root;
    }

    public Node getNode(int value) {
        Node current = root;
        while (current.getValue() != value) {
            if (value < current.getValue()) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void print(Node current) {
        if (current != null) {
            System.out.println("Node: " + current.getValue() +
                    " left: " + ((current.getLeftChild() != null) ? current.getLeftChild().getValue() : "*") +
                    " right: " + ((current.getRightChild() != null) ? current.getRightChild().getValue() : "*"));
        } else {
            System.out.println("There isn't this node");
        }
    }
}