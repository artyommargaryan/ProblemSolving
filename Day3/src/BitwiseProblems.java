import java.util.Arrays;

public class BitwiseProblems {
    //count the number of bits in a number with a value of 1
    //time complexity: O(1),space complexity: O(1)
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
    //time complexity: O(1), space complexity: O(1)
    public boolean countOfOneIsEven(int num) {
        return countOfOne(num) % 2 == 0;
    }

    //perform a swap operation to shift bits i and j of a number
    //time complexity: O(1),space complexity: O(1)
    public int bitSwap(int num, int i, int j) {
        if (num == 0) {
            return 0;
        }

        if (i < 0 || i >= 32) {
            throw new RuntimeException("Invalid i, i must be in [0, 31] interval");
        }

        if (j < 0 || j >= 32) {
            throw new RuntimeException("Invalid j, j must be in [0, 31] interval");
        }

        int[] arrNum = new int[32];

        for (int k = 0; num != 0; k++) {
            arrNum[k] = num & 1;
            num >>>= 1;
        }

        int tmp = arrNum[i];
        arrNum[i] = arrNum[j];
        arrNum[j] = tmp;

        return this.convertBinaryToDecimal(arrNum);
    }

    //reverse the bits of the number, for example: 11110000 -> 00001111
    //time complexity: O(1), space complexity: O(1)
    public int reverse(int num) {
        if (num == 0 || num == -1) {
            return num;
        }

        int[] revNum = new int[32];


        for (int i = 0; num != 0; i++) {
            revNum[i] = num & 1;
            num >>>= 1;
        }

        int tmp;
        for (int i = 0; i < 16; i++) {
            tmp = revNum[i];
            revNum[i] = revNum[31 - i];
            revNum[31 - i] = tmp;
        }

        return convertBinaryToDecimal(revNum);
    }

    //function to convert decimal number from array that contains binary values
    //time complexity: O(1),space complexity: O(1)
    private int convertBinaryToDecimal(int[] arrNum) {
        long result = 0;
        boolean isPositive = true;

        if (arrNum[31] == 1) {
            isPositive = false;
            for (int i = 0; i < 32; i++) {
                if (arrNum[i] == 0) {
                    arrNum[i] = 1;
                } else {
                    arrNum[i] = 0;
                }
            }

            for (int i = 0; i < 32; i++) {
                if (arrNum[i] == 0) {
                    arrNum[i] = 1;
                    break;
                }
                arrNum[i] = 0;
            }
        }

        for (int i = 0; i < 32; i++) {
            result += arrNum[i] * Math.pow(2, i);
        }

        if (!isPositive) {
            return (int) -result;
        }

        return (int) result;
    }
}
