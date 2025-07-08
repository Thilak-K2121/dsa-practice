class Solution {
    
    public static boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) 
            return false;

        int[] freq = new int[26];  // Array for 26 lowercase letters

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) 
                return false;
        }

        return true;
    }
}
