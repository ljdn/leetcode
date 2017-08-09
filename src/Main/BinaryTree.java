package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lduan on 8/6/17.
 */
public class BinaryTree {

     // Definition for a binary tree node.
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return new ArrayList<String>();

        ArrayList<String> paths = new ArrayList<>();

        String pathSoFar = Integer.toString(root.val);

        traverseNode(root, pathSoFar, paths);

        return paths;

    }

    private void traverseNode(TreeNode node, String pathSoFar, List<String> paths) {
        if (node.right != null) {
            pathSoFar += "->" + Integer.toString(node.right.val);
            traverseNode(node.right, pathSoFar, paths);
        }
        if (node.left != null) {
            pathSoFar += "->" + Integer.toString(node.left.val);
            traverseNode(node.left, pathSoFar, paths);
        }
        if (node.right == null && node.left == null) {
            paths.add(pathSoFar);
        }
    }

}
