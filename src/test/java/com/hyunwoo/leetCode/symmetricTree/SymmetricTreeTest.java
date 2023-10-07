package com.hyunwoo.leetCode.symmetricTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {

    @Test
    void isSymmetric() {
        TreeNode lright4 = new TreeNode(4, null, null);
        TreeNode lleft3 = new TreeNode(3, null, null);
        TreeNode lcenter2 = new TreeNode(2, lleft3, lright4);
        TreeNode rright4 = new TreeNode(3, null, null);
        TreeNode rleft3 = new TreeNode(4, null, null);
        TreeNode rcenter2 = new TreeNode(2, rleft3, rright4);
        TreeNode root = new TreeNode(1, lcenter2, rcenter2);

        SymmetricTree symmetricTree = new SymmetricTree();

        assertEquals(true, symmetricTree.isSymmetric(root));
    }

}
