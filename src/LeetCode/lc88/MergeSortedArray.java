package LeetCode.lc88;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m + n;
        int i = m;
        int j= n;
        while (i >= 0 && j >= 0){
            if (i == 0){
                nums1[len1 - 1] = nums2[j - 1];
            }
            if (j == 0){
                break;
            }
            if (nums1[i - 1] >= nums2[j - 1]){
                nums1[len1 - 1] = nums1[i - 1];
            }else {
                nums1[len1 - 1] = nums2[j - 1];
            }
            i--;
            j--;
            len1--;
        }
    }

}
