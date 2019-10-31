// Given an array of integers arr, write a function that 
// returns true if and only if the number of occurrences 
// of each value in the array is unique.

// Example Input: [1,2,2,1,1,3] Output: true
// Example Input: [-3,0,1,-3,1,1,1,-3,10,0] Output: true

// Solution: 
// Count number of occurences of each integer in the array and store in HashMap.
// HashSets contain unique values. Compare the size of a HashSet containing the 
// # of occurences of each integer to the total number of integers. If they are not equal,
// the # of occurences of each integer are not unique.

// Runtime: O(n)

class Solution {
    public static boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i < arr.length; i++)
		{
			if(!map.containsKey(arr[i]))
				map.put(arr[i], 0);
			map.put(arr[i], map.get(arr[i]) + 1);
		}

		Set<Integer> valueSet = new HashSet<>(map.values());
		
		return map.size() == valueSet.size();
	}
}