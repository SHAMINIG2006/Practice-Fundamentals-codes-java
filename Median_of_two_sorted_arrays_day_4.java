import java.util.*;
public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int M = nums1.length;
        int N = nums2.length;
        int totalLen = M + N;
        int[] mergedArray = new int[totalLen];
        int r = 0;

        for(int i=0; i<M; i++){
            mergedArray[r++] = nums1[i];
        }
        for(int i=0; i<N; i++){
            mergedArray[r++] = nums2[i];
        }
        Arrays.sort(mergedArray);

        if(totalLen % 2 == 1) {
            return mergedArray[totalLen/2];
        } else {
            int mid1 = mergedArray[(totalLen/2) - 1];
            int mid2 = mergedArray[totalLen/2];
            return (mid1 + mid2) / 2.0;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] nums1 = new int[m];
        for(int i=0; i<m; i++){
            nums1[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] nums2 = new int[n];
        for(int i=0; i<n; i++){
            nums2[i] = sc.nextInt();
        }
        double result = findMedianSortedArrays(nums1, nums2);
        System.out.printf("%.5f\n", result);  
    }
}
