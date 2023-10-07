//https://leetcode.com/problems/symmetric-tree/
package com.hyunwoo.leetCode.symmetricTree;

import java.util.ArrayList;
import java.util.List;

public class SymmetricTree {

    List<Integer> inorderList = new ArrayList<>();

    public boolean isSymmetric(TreeNode root) {

        inorder(root);

        int mid = inorderList.size() / 2;
        int i = mid;
        int j = mid + 1;
        for (; i <= 0; ) {
            for (; j <= inorderList.size(); ) {
                if (inorderList.get(i) != inorderList.get(j)) {
                    return false;
                }
            }
            i--;
            j++;
        }

        return true;
    }

    private void inorder(TreeNode root) {

        if (root == null ) {
            return;
        }

        inorder(root.left);
        inorderList.add(root.val);
        inorder(root.right);
    }

}
