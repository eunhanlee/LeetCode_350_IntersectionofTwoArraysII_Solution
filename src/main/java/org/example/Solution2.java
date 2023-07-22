package org.example;

import java.util.*;

public class Solution2 {
    /**
     * Finds the intersection of two sorted arrays and returns the result.
     * The input arrays nums1 and nums2 are assumed to be sorted in ascending order.
     *
     * @param nums1 The first sorted integer array nums1.
     * @param nums2 The second sorted integer array nums2.
     * @return An array containing the intersection elements.
     */
    public int[] intersect(int[] nums1, int[] nums2) {

        //Follow up:
        //What if the given array is already sorted? How would you optimize your algorithm?
        //What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> tempResult = new ArrayList<>();
        int[] result;
        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < nums1.length && pointer2 < nums2.length) {
            if (nums1[pointer1] == nums2[pointer2]) {
                tempResult.add(nums1[pointer1]);
                pointer1++;
                pointer2++;
            } else if (nums1[pointer1] < nums2[pointer2]) {
                pointer1++;
            } else {
                pointer2++;
            }
        }

        result = new int[tempResult.size()];
        for (int i = 0; i < tempResult.size(); i++) {
            result[i] = tempResult.get(i);
        }

        return result;
    }
}
