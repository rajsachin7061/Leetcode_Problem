class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr3[] = new int[nums1.length + nums2.length];

         for(int i=0; i<nums1.length; i++) {
      arr3[i] = nums1[i];
      }

       //second array copy
       for(int i=0; i<nums2.length; i++) {
      arr3[nums1.length+i] = nums2[i];
     }

     for(int i = 0; i<arr3.length; i++) {
      //compare 
      for(int j= i+1; j<arr3.length; j++) {
       if(arr3[i]>arr3[j]) {
        int temp = arr3[i];
        arr3[i] = arr3[j];
        arr3[j] = temp;
       }
      }
     }

     for(int i=0; i<arr3.length; i++) { 
      System.out.println(arr3[i]+ " ");
     }
     int mid = (arr3.length)/2;

     //print arr3
     
      if (arr3.length % 2 == 1) {
            return arr3[mid];
        } else {
            return (arr3[mid - 1] + arr3[mid]) / 2.0;
        }

    } 
}