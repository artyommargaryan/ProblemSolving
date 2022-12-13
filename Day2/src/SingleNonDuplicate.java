//You are given a sorted array consisting of only integers where every element
// appears exactly twice, except for one element which appears exactly once.
//Return the single element that appears only once.

//time complexity: O(logn),space complexity: O(1)
public class SingleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low != high) {
            int mid = low + (high - low) / 2;

            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            } else {
                high = mid;
            }

        }
        
        return nums[high];
    }
}
