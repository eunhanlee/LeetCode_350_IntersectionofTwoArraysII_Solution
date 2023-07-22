import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.example.Solution;
import org.example.Solution2;
import org.junit.jupiter.api.Test;

public class Solution2Test {

    @Test
    public void testSolution() {
        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {1, 2, 2, 3, 5};
        int[] nums2 = {2, 2, 4, 5};
        int[] expected1 = {2, 2, 5};
        int[] actual1 = solution.intersect(nums1, nums2);
        assertArrayEquals(expected1, actual1);

        // Test Case 2
        int[] nums3 = {1, 1, 2, 3, 4};
        int[] nums4 = {1, 2, 2, 4};
        int[] expected2 = {1, 2, 4};
        int[] actual2 = solution.intersect(nums3, nums4);
        assertArrayEquals(expected2, actual2);

        // Test Case 3
        int[] nums5 = {2, 4, 6, 8};
        int[] nums6 = {1, 3, 5, 7};
        int[] expected3 = {};
        int[] actual3 = solution.intersect(nums5, nums6);
        assertArrayEquals(expected3, actual3);

        // Test Case 4
        int[] nums7 = {1, 2, 3, 4, 5};
        int[] nums8 = {5, 6, 7, 8, 9};
        int[] expected4 = {5};
        int[] actual4 = solution.intersect(nums7, nums8);
        assertArrayEquals(expected4, actual4);

        // Test Case 5
        int[] nums9 = {};
        int[] nums10 = {2, 4, 6, 8};
        int[] expected5 = {};
        int[] actual5 = solution.intersect(nums9, nums10);
        assertArrayEquals(expected5, actual5);

        // Test Case 6
        int[] nums11 = {1, 1, 1};
        int[] nums12 = {1, 1, 1};
        int[] expected6 = {1, 1, 1};
        int[] actual6 = solution.intersect(nums11, nums12);
        assertArrayEquals(expected6, actual6);

        // Test Case 7
        int[] nums13 = {2, 4, 6};
        int[] nums14 = {1, 3, 5, 7};
        int[] expected7 = {};
        int[] actual7 = solution.intersect(nums13, nums14);
        assertArrayEquals(expected7, actual7);

        // Test Case 8
        int[] nums15 = {1, 1, 2, 2, 3, 3};
        int[] nums16 = {2, 2, 3, 3, 4, 4};
        int[] expected8 = {2, 2, 3, 3};
        int[] actual8 = solution.intersect(nums15, nums16);
        assertArrayEquals(expected8, actual8);

        // Test Case 9
        int[] nums17 = {1, 2, 3, 4, 5};
        int[] nums18 = {6, 7, 8, 9, 10};
        int[] expected9 = {};
        int[] actual9 = solution.intersect(nums17, nums18);
        assertArrayEquals(expected9, actual9);

        // Test Case 10
        int[] nums19 = {1, 2, 3, 4};
        int[] nums20 = {1, 2, 3, 4};
        int[] expected10 = {1, 2, 3, 4};
        int[] actual10 = solution.intersect(nums19, nums20);
        assertArrayEquals(expected10, actual10);

        System.out.println("All test cases passed.");
    }
}
