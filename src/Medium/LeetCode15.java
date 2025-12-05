package Medium;

import java.util.*;

// 3Sum
// Time Complexity - O(n^2)
// Space Complexity - O(n)

public class LeetCode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++){
            if(i!=0 && nums[i] == nums[i-1]) continue;

            int l = i+1, r = nums.length - 1;

            while(l < r){
                int target = -nums[l] - nums[r];
                if(nums[i] == target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);

                    result.add(list);

                    while(l < r && nums[l] == nums[l+1]) l++;
                    while(l < r && nums[r] == nums[r-1]) r--;

                    l++;r--;
                }else if(nums[i] < target) l++;
                else r--;
            }
        }

        return result;
    }
}
