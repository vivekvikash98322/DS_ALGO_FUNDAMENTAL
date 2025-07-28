package com.cozzycoder.revision.dataStructure.tree;

import com.sun.source.tree.Tree;

public class MaxDepthOfBinaryTree {

    public static void main(String[] args) {
        System.out.println(maxDepth(new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)))));
    }

    public static int maxDepth(TreeNode root) {

        int index = 0;
        int max = 0;

        return traverse(root, index, max);
    }

    public static int traverse(TreeNode node, int index, int max ) {

        if(node == null){
            return max;
        }

        max = Math.max(max, index);
        traverse(node.left, index++, max);
        traverse(node.right, index++, max);

        return max;
    }
}
