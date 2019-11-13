// Uncommon Words from Two Sentences

// We are given two sentences A and B.  (A sentence is a string of space separated words.  
// Each word consists only of lowercase letters.)
// A word is uncommon if it appears exactly once in one of the sentences, 
// and does not appear in the other sentence.
// Return a list of all uncommon words. 
// You may return the list in any order.

// Solution: A word is basically uncommon if it is completely unique. Use HashMap to store
// unique occurences of each word.
// Runtime: O(M + N) lengths of Strings a + b

class Solution {
	public String[] uncommonFromSentences(String a, String b) 
	{
       HashMap<String, Integer> map = new HashMap<>();

       for(String word: a.split(" "))
       {
       		if(map.get(word) == null)
       			map.put(word, 0);
       	map.put(word, map.get(word) + 1);
       }

       for(String word: b.split(" "))
       {
       		if(map.get(word) == null)
       			map.put(word, 0);
       	map.put(word, map.get(word) + 1);
       }

       ArrayList<String> list = new ArrayList<String>();

       for(String word: map.keySet())
       {
       	if(map.get(word) == 1)
       		list.add(word);
       }

       return list.toArray(new String[list.size()]);
    }
}