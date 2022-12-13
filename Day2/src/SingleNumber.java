//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

//time complexity: O(n),space complexity: O(1)
public class SingleNumber {
    public int singleNumber(int[] nums){
        int result = 0;
        for (int x : nums) {
            result ^= x;
        }

        return result;
    }
}
