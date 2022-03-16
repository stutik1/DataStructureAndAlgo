package PatternSlidingWindow;

import java.util.HashMap;

public class LongestSubstringWithKDistinctCharacters {
    public static int longestSubstringWithKDistinctCharacters(String str, int k) {
        if (str.length() == 0 || k == 0) {
            return 0;
        }
        int i = 0;   // start
        int j = 0;  //end
        int result = 0; // length of character
        HashMap<Character, Integer> hashMap = new HashMap<>();
        while (j < str.length()) {
            char c = str.charAt(j);
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1); //(getOrDefault) --> Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key
            while (hashMap.size() > k) {
                char d = str.charAt(i);
                if (hashMap.get(d) == 1) {
                    hashMap.remove(d);
                 }
                else {
                    hashMap.put(d, hashMap.get(d) - 1);
                }
                i++;
            }
             result = Math.max(result, j - i + 1);
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "araaaci";
         int k = 2;
        System.out.println(longestSubstringWithKDistinctCharacters(str,k));
        System.out.println(longestSubstringWithKDistinctCharacters("araaci", 2));
        System.out.println(longestSubstringWithKDistinctCharacters("araaci", 1));
    }
}
