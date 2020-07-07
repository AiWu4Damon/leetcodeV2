package com.damon.sort;

/**
 * 对有一定顺序的 排序很快
 * 插入排序 从小到大
 * @ClassName InsertSort
 * @Description TODO
 * @Author Damon
 * @Date 2020/7/7 下午1:24
 * @Version 1.0.0
 **/
public class InsertSort extends AbstractSort{
    @Override
    protected int[] sort(int[] nums) {
        //第一个元素认为是有序 从第二个元素开始
        for (int i=1,length=nums.length;i<length;i++){
            int ins = nums[i];
            for (int j=i-1;j>=0;j--){
                if (ins>=nums[j]){
                    nums[j+1]=ins;
                    break;
                }else{
                    nums[j+1]=nums[j];
                    if (j==0){
                        nums[0]=ins;
                    }
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {23,3,5,2,6,8,1,5,10,22,434,1,3,4,5,8,2,0};
        InsertSort insertSort = new InsertSort();
        int[] ints = insertSort.toSort(nums);
        for (int anInt : ints) {
            System.out.print(" ");
            System.out.print(anInt);
        }
    }
}
