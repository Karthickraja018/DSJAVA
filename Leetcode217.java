import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(num)) {  
                return true;
            }
            set.add(num);
        }
        
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 1}; 
        
        Solution sol = new Solution();
        boolean result = sol.containsDuplicate(nums);
        
        System.out.println("Contains Duplicate? " + result);
    }
}
