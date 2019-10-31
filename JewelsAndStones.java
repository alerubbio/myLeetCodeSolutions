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