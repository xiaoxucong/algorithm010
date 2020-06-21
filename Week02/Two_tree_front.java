package com.algorithm.ok.week_2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/***
 * 144. 二叉树的前序遍历
 */
public class Two_tree_front {
    @Test
    public  void main() {

    }

    //递归遍历
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        if(root == null) {
            return li;
        }
        test(li,root);
        return li;
    }

    private void  test(List<Integer> li,TreeNode root) {
        li.add(root.val);
        if(root.left != null){
            test(li,root.left);
        }
        if(root.right != null){
            test(li,root.right);
        }
    }
}
