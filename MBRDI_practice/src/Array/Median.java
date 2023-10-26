package Array;

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4,5};
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length+nums2.length];

        System.arraycopy(nums1,0,arr,0,nums1.length);
        System.arraycopy(nums2,0,arr,nums1.length,nums2.length);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        double result;
        if(arr.length%2==0){
           int i = arr.length/2;
            System.out.println(i);
           result = (arr[i-1]+arr[i])/2f;
        }
        else{
            int i = (int) ((arr.length)/2f);
            result = arr[i];
        }



        return result;

    }
}
