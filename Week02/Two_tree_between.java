package com.algorithm.ok.week_2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/***
 * 94. 二叉树的中序遍历
 */
public class Two_tree_between {
    @Test
    public  void main() {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        if(root  == null){
            return li;
        }
        test(root,li);
        return li;
    }

    public void test(TreeNode root, List < Integer > res) {
        if (root != null) {
            if (root.left != null) {
                test(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                test(root.right, res);
            }
        }
    }
}
