public class BitwiseProblems {
    //count the number of bits in a number with a value of 1
    //time complexity: O(logn),space complexity: O(1)
    public int countOfOne(int num) {
        int counter = 0;

        while (num != 0) {
            counter += (num & 1);
            num >>>= 1;
        }

        return counter;
    }

    //check whether the number of bits in a number value of 1 is odd or even
    // if even return true, else return falls
    //time complexity: O(logn), space complexity: O(1)
    public boolean countOfOneIsEven(int num) {
        return (countOfOne(num) & 1) == 0;
    }

    //perform a swap operation to shift bits i and j of a number
    //time complexity: O(1),space complexity: O(1)
    public int bitSwap(int num, int i, int j) {
        return (1 << i) ^ (1 << j) ^ num;
    }


    //reverse the bits of the number, for example: 11110000 -> 00001111
    //time complexity: O(1), space complexity: O(1)
    public int reverse(int n) {
        int shiftAmount = 31;
        int result = 0;
        while (shiftAmount != 0) {
            result |= ((n & 1) << shiftAmount);
            --shiftAmount;
            n >>>= 1;
        }

        return result;
    }
}
