package com.algorithm.ok.week_2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/***
 * 429. N叉树的层序遍历
 */
public class N_tree_sequence {
    @Test
    public  void main() {

    }

    public List<List<Integer>> levelOrder(Node root) {
        List<Node> children = new ArrayList<>();
        List<List<Integer>> li = new ArrayList<>();
        if(root == null) {
            return li;
        }
        children.add(root);
        test(children,li);
        return li;
    }

    private void test(List<Node> children,List<List<Integer>> li) {
        List<Integer> list = new ArrayList<>();
        List<Node> childrenNode = new ArrayList<>();
        if(children != null && children.size() > 0) {
            for(int i= 0;i < children.size();i++){
                list.add(children.get(i).val);
                childrenNode.addAll(children.get(i).children);
            }
            li.add(list);
            test(childrenNode,li);
        }

    }
}
