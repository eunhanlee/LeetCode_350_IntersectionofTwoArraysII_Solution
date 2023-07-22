package org.example;

public class Main {
    public static void main(String[] args) {
        Solution tt = new Solution();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        for(int val: tt.intersect(nums1,nums2)) System.out.print(val+" ");
    }
}