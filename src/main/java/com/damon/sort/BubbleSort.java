package com.damon.sort;

import java.util.HashMap;

/**
 * 冒泡排序
 *
 * @ClassName BubbleSort
 * @Description TODO
 * @Author Damon
 * @Date 2020/7/7 上午11:12
 * @Version 1.0.0
 **/
public class BubbleSort extends AbstractSort {


    @Override
    protected int[] sort(int[] nums) {
        for (int j = 0, length = nums.length; j < length-1; j++) {
            for (int i = length-2; i >= j; i--) {
                if (nums[i] > nums[i + 1]) {
                    int mid = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = mid;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3,5,2,6,8,1,5,10,22,434,1,3,4,5,8,2,0};
        BubbleSort bubbleSort = new BubbleSort();
        int[] ints = bubbleSort.toSort(nums);
        for (int anInt : ints) {
            System.out.print(" ");
            System.out.print(anInt);
        }
    }
}
