// A self-dividing number is a number that is divisible by every digit it contains.
// For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
// Also, a self-dividing number is not allowed to contain the digit zero.
// Given a lower and upper number bound, output a list of every possible self dividing number, 
// including the bounds if possible.

// Solution: 
// Pass each value in array to checkDivide. checkDivide grabs last digit and checks 
// if divisible. If so, divide find next digit and repeat.
// Runtime: O(nlogk)    n = (right - left) + 1    k = value in range [left, right]

class Solution {
    public boolean checkDivide(int n){
        
        int temp = n;
        while(temp > 0)
        {
            if(temp % 10 == 0)
                return false;
            if(n % (temp % 10) == 0)
                temp = temp / 10;
            else 
                return false;
        }
        return true;
    }
    
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arr = new ArrayList<Integer>();
        
        for(int i = left; i <= right; i++)
        {
            if(checkDivide(i) == true)
            {
                arr.add(i);
            }
        }
        return arr;
    }
}