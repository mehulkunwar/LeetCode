package Medium;

// Product of Array except itself
// Time Complexity - O(n)
// Space Complexity - O(1)

public class LeetCode238 {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;


        for(int i=0; i<nums.length; i++){
            result[i] = product;
            product = product * nums[i];
        }

        product = 1;

        // 1 , 1 ,2 ,6
        for(int i=nums.length-1; i>=0; i--){
            result[i] = product * result[i];
            product = product * nums[i];
        }

        return result;
    }
}
