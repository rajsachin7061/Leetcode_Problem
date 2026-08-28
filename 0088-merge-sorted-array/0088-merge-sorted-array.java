class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] copy = new int[m];

        for (int x = 0; x < m; x++) {
            copy[x] = nums1[x];
        }

        // Three pointers
        int i = 0; // copy
        int j = 0; // nums2
        int k = 0; // nums1

        // Merge
        while (i < m && j < n) {

            if (copy[i] <= nums2[j]) {
                nums1[k] = copy[i];
                i++;
            } else {
                nums1[k] = nums2[j];
                j++;
            }

            k++;
        }

        // Remaining elements of copy
        while (i < m) {
            nums1[k] = copy[i];
            i++;
            k++;
        }

        // Remaining elements of nums2
        while (j < n) {
            nums1[k] = nums2[j];
            j++;
            k++;
        }
    }
}