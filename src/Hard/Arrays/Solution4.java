package Hard.Arrays;

import java.util.ArrayList;

public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1Length = nums1.length;
        int num2Length = nums2.length;
        int totalLength = num1Length + num2Length;
        double median = 0;
        ArrayList<Object> mergedArray = new ArrayList<>();
        if(num1Length !=0 && num2Length !=0){
            int m = 0; int n = 0;
            for(int i = 0; m<num1Length && n<num2Length; i++){
                if(nums1[m]< nums2[n]){
                    mergedArray.add(nums1[m]);
                    m++;
                }
                else{
                    mergedArray.add(nums2[n]);
                    n++;
                }
            }
        }
        return median;
    }
}
