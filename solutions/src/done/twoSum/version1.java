package done.twoSum;

public class version1 {
    public int[] twoSum(int[]nums, int target){
        int[] output;

        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    output = new int[]{i, j};
                    return output;
                }
            }
        }
        return null;
    }
}
