class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num:nums){
            set.add(num);
        }
        int var=1;
        while(set.contains(var)){
            var++;
        }
        return var;
    }
}
