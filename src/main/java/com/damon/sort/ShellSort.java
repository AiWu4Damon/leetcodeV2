package com.damon.sort;

/**
 * 希尔排序 是插入排序的改进版本
 * @ClassName ShellSort
 * @Description TODO
 * @Author Damon
 * @Date 2020/7/7 上午10:18
 * @Version 1.0.0
 **/
public class ShellSort extends InsertSort{
    @Override
    protected int[] sort(int[] nums) {
        final int reduce = 2;
        int length = nums.length;
        int step = nums.length;
        while((step=step/reduce)>0){
            for (int i=step;i<length;i++){
                int mid = nums[i];
                for (int j=i-step;j>=0;j-=step){
                    if (mid<nums[j]){
                        nums[j+step]=nums[j];
                    }else{
                        nums[j+step]=mid;
                        break;
                    }
                    if (j<step){
                        nums[j]=mid;
                        break;
                    }
                }
            }
            if (step==1){
                break;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {100,23,1,23,3,5,2,2,5,6,8,1,5,10,22,434,1,3,4,5,8,2,0,3,1,6,4};
        System.out.println("长度: "+nums.length);
        ShellSort shellSort = new ShellSort();
        int[] ints = shellSort.toSort(nums);
        for (int anInt : ints) {
            System.out.print(" ");
            System.out.print(anInt);
        }
    }
}
