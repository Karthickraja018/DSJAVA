//Import necessary Library for this program i added HashSet
import java.util.HashSet;

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        //Define HashSet Objects
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2){
            set2.add(num);
        } 

        int count1 = 0; 
        int count2 = 0;

        for (int num : nums1) {
            if (set2.contains(num)){
                count1++;
            }
        }
        for (int num : nums2) {
            if (set1.contains(num)){
                count2++;
            } 
        }

        return new int[]{count1, count2};
    }
}
public class Main{
  public static void main(String[] args){
    int[] nums1={2,3,2};
    int[] nums2={1,2};
    Solution fun = new Solution();
    int[] result=fun.findIntersectionValues(nums1,nums2);
    System.out.println(Arrays.toString(result));
  }
}
