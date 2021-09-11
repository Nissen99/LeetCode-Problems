public class Solution
{
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    int totalLength = nums1.length + nums2.length;
    int[] mergedArray = new int[totalLength];

    int counter = 0;
    int i = 0;
    int j = 0;

    while (i+j < totalLength)
    {
      if (i == nums1.length){
        while (j  < nums2.length)
        {
          mergedArray[counter++] = nums2[j++];
        }
        break;
      }else if (j == nums2.length){
        while (i  < nums1.length)
        {
          mergedArray[counter++] = nums1[i++];
        }
        break;
      }


      if (nums1[i] < nums2[j]){
        mergedArray[counter++] = nums1[i++];
      }else {
        mergedArray[counter++] = nums2[j++];
      }

    }


    if (mergedArray.length % 2 == 0){

      return (double) (mergedArray[mergedArray.length/2] + mergedArray[mergedArray.length/2 -1]) /2;
    }else {
      return mergedArray[mergedArray.length/2 ];
    }
  }
}
