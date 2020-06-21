package com.algorithm.ok.week_2;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/***
 * 589. N叉树的前序遍历
 */
public class N_tree_front {
    @Test
    public  void main() {

    }

    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        if(root == null) {
            return output;
        }
        while (!stack.isEmpty()) {
            Node nd = stack.pollLast();
            output.add(nd.val);
            Collections.reverse(nd.children);
            for (Node item : nd.children) {
                stack.add(item);
            }
        }
        return output;
    }
}
