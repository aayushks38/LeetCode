/*
LeetCode 88 - Merge Sorted Array

Approach:
Both arrays are already sorted. Instead of merging from the front,
we merge from the back to avoid overwriting elements in nums1.

i -> last valid element of nums1
j -> last element of nums2
k -> last position of nums1

At each step, compare nums1[i] and nums2[j].
Place the larger element at nums1[k] and move the corresponding pointer.

Time Complexity: O(m + n)
Space Complexity: O(1)
*/
import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;      // Last valid element in nums1
        int j = n - 1;      // Last element in nums2
        int k = m + n - 1;  // Last position in nums1

        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        // Copy remaining elements from nums2
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}