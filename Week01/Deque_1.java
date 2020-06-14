package com.algorithm;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Deque_1 {

    @Test
    public  void main() {
        int [] nums =new int[]{1,1,2};
        int sss = removeDuplicates(nums);
        System.out.println(sss);
    }

    //26. 删除排序数组中的重复项 删除排序数组中的重复项（Facebook、字节跳动、微软在半年内面试中考过）
    public int removeDuplicates(int[] list) {

        int tem = 0;
        for (int i = 1; i < list.length; i++) {
            if(list[tem] !=list[i] ) {
                tem++;

                System.out.println(list[tem]+"=====+"+list[i]);
                list[tem] =list[i];
            }
        }

        return  tem +1;
    }

    //189. 旋转数组  给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
    public void rotate(int[] nums, int k) {
        if(nums.length < k) {
            k = k%nums.length;
        }
        int[] list =nums.clone();
        for(int i=0;i<list.length;i++){

            if(i < k) {
                nums[i]=list[list.length -k + i];
            }else {
                nums[i]=list[i-k];
            }
        }

    }

    //283. 移动零 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if(temp != 0) {

                if(i != j){
                    nums[j] = nums[i];
                    nums[i] =0;
                }
                j++;
            }

        }



    }
//1. 两数之和 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//
    public int[] twoSum(int[] nums, int target) {
        int[] it = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if(map.containsKey(nums[i])) {
                it[0]=i;
                it[1]=map.get(nums[i]);
                return it;
            }
            map.put(target-nums[i],i);
        }
        return it;
    }
}
