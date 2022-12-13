public class BitwiseProblems {
    //count the number of bits in a number with a value of 1
    //time complexity: O(logn),space complexity: O(1)
    public int countOfOne(int num) {
        int counter = 0;

        while (num != 0) {
            if ((num & 1) == 1) {
                counter++;
            }
            num >>>= 1;
        }

        return counter;
    }

    //check whether the number of bits in a number value of 1 is odd or even
    // if even return true, else return falls
    //time complexity: O(logn),space complexity: O(1)
    public boolean countOfOneIsEven(int num) {
        return countOfOne(num) % 2 == 0;
    }
}
