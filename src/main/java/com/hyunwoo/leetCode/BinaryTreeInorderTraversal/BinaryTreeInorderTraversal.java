//https://leetcode.com/problems/binary-tree-inorder-traversal/
package com.hyunwoo.leetCode.BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    private List<Integer> ret = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {

        inorder(root);

        return ret;
    }

    private void inorder(TreeNode root) {

        if (root == null ) {
            return;
        }

        inorder(root.left);
        ret.add(root.val);
        inorder(root.right);
    }

}
