package org.example;

import java.util.*;

public class Solution {
    /**
     * Finds the intersection of two arrays and returns the result.
     *
     * @param nums1 The first integer array nums1.
     * @param nums2 The second integer array nums2.
     * @return An array containing the intersection elements.
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> tempResult = new ArrayList<>();
        int[] result;

        // Traverse nums1 and record the frequency of each element in the map
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Traverse nums2 to find intersections, add them to tempResult, and adjust frequencies in the map
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                tempResult.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        // may use stream
        result = new int[tempResult.size()];
        for (int i = 0; i < tempResult.size(); i++) {
            result[i] = tempResult.get(i);
        }

        return result;
    }
}
