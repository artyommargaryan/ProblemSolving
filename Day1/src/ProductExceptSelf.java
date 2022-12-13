//Given an integer array nums, return an array answer such that answer[i] is equal to
// the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

//time complexity: O(n),space complexity: O(n)
class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for (int i = 1; i < n; ++i) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int k = 1;
        for (int i = n - 1; i >= 0; --i) {
            result[i] *= k;
            k *= nums[i];
        }

        return result;
    }
}