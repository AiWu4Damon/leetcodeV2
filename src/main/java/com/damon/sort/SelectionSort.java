package com.damon.sort;

/**
 * 选择排序 从小的到大 稳定的O(n2)
 * @ClassName SelectionSort
 * @Description TODO
 * @Author Damon
 * @Date 2020/7/7 下午1:23
 * @Version 1.0.0
 **/
public class SelectionSort extends AbstractSort{
    @Override
    protected int[] sort(int[] nums) {
        for (int i=0,length=nums.length;i<length;i++){
            //下标
            int index=i;
            for (int j=i;j<length;j++){
                if (nums[index]>nums[j]){
                    index=j;
                }
            }
            //交换 下标 i和index
            if (i==index){continue;}
            int mid = nums[i];
            nums[i] = nums[index];
            nums[index] = mid;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {3,5,2,6,8,1,5,10,22,434,1,3,4,5,8,2,0};
        AbstractSort selectionSort = new SelectionSort();
        int[] ints = selectionSort.toSort(nums);
        for (int anInt : ints) {
            System.out.print(" ");
            System.out.print(anInt);
        }
    }
}
