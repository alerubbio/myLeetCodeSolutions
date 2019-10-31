// You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  
// Each character in S is a type of stone you have.  
// You want to know how many of the stones you have are also jewels.

// Solution: Store characters in J in HashSet. Search for characters of S in Set of J. 
// Runtime: O(n).

class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> jSet = new HashSet<>();
        for(Character ch : J.toCharArray()) {
            jSet.add(ch);
        }
        int count = 0;
        for(Character ch: S.toCharArray()) {
            if(jSet.contains(ch)) {
                count++;
            }
        }
        return count;
    }
}