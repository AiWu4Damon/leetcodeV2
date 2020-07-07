package com.damon.sort;

/**
 * @ClassName AbstractSort
 * @Description TODO
 * @Author Damon
 * @Date 2020/7/7 上午11:15
 * @Version 1.0.0
 **/
public abstract class AbstractSort implements Sort {
    @Override
    public int[] toSort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        if (nums.length == 1){
            return nums;
        }
        return sort(nums);
    }

    /**
     * 排序的主要实现方法
     *
     * @param nums 不为空且length至少为2个
     * @return 排序完毕的nums
     */
    protected abstract int[] sort(int[] nums);
}
