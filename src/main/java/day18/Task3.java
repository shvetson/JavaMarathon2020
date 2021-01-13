package day18;

public class Task3 {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(20);
        tree.insert(14);
        tree.insert(11);
        tree.insert(5);
        tree.insert(8);
        tree.insert(16);
        tree.insert(15);
        tree.insert(18);
        tree.insert(23);
        tree.insert(22);
        tree.insert(27);
        tree.insert(24);
        tree.insert(150);

        tree.dfs(tree.getRoot());
        System.out.println();
        tree.print(tree.getRoot());
        tree.print(tree.getNode(5));
        tree.print(tree.getNode(23));
        tree.print(tree.getNode(30));

    }
}