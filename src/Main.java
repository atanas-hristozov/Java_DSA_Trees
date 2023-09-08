import java.util.List;

public class Main {
    public static void main(String[] args) {
        //    8
        // 66   5
        //     3  9
        TreeNode<Integer> root = new TreeNode<>(8);
        TreeNode<Integer> anotherNode = new TreeNode<>(5, List.of(new TreeNode<>(3), new TreeNode<>(9)));
        root.children = List.of(new TreeNode<>(66), anotherNode);

        BinaryTreeNode<Integer> binaryTreeRoot = new BinaryTreeNode<>(8);
        BinaryTreeNode<Integer> binaryTreeAnotherNode = new BinaryTreeNode<>(5,
                new BinaryTreeNode<>(3),
                new BinaryTreeNode<>(9));
        binaryTreeRoot.left = new BinaryTreeNode<>(66);
        binaryTreeRoot.right = binaryTreeAnotherNode;
    }
}