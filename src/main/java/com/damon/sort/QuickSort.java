package com.damon.sort;

/**
 * 快速排序 默认区的第一个数字为界
 * @Description: //TODO(对象型指标操作表)
 * @Author: fjy
 * @Date: 2020/7/8 0008 21:54
 * @Version: V1.0
 */
public class QuickSort extends AbstractSort {
    @Override
    protected int[] sort(int[] nums) {
        return qucikSort(nums,0,nums.length-1);
//        return qsort(nums,0,nums.length-1);
    }

    private int[] qucikSort(int[] nums,int left,int right){
        int backLeft = left;
        int backRight = right;
        int mid = nums[backLeft];
        while(left<right){
            while(nums[left]<mid &&left<right){
                left++;
            }
            while (nums[right]>mid && left<right){
                right--;
            }
            if ((nums[left]==nums[right]) && (left<right)){
                left++;
            }else{
                swap(left,right,nums);
//                left++;
//                right--;
            }
        }
        if (backLeft<left-1){
            qucikSort(nums,backLeft,left-1);
        }
        if (right+1<backRight) {
            qucikSort(nums,right+1,backRight);
        }
        return nums;
    }

    /**
     * 官方排序
     * @param arr
     * @param start
     * @param end
     * @return
     */
    public static int[] qsort(int arr[],int start,int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i<j) {
            while ((i<j)&&(arr[j]>pivot)) {
                j--;
            }
            while ((i<j)&&(arr[i]<pivot)) {
                i++;
            }
            if ((arr[i]==arr[j])&&(i<j)) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i-1>start) arr=qsort(arr,start,i-1);
        if (j+1<end) arr=qsort(arr,j+1,end);
        return (arr);
    }
    private void swap(int i,int j,int[] nums){
        int mid = nums[i];
        nums[i] = nums[j];
        nums[j] = mid;
    }

    public static void main(String[] args) {
        int[] nums = {3,5,2,6,8,1,5,10,22,434,1,3,4,5,8,2,0};
        QuickSort quickSort = new QuickSort();
        int[] ints = quickSort.toSort(nums);
        for (int anInt : ints) {
            System.out.print(" ");
            System.out.print(anInt);
        }
    }
}
