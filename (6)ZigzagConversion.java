class Solution {
    public String convert(String s, int numRows) {
        
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        
        StringBuilder[] strings = new StringBuilder[numRows];
        
        // Initialize StringBuilder for each row
        for (int i = 0; i < numRows; i++) {
            strings[i] = new StringBuilder();
        }
        
        int index = 0;
        int step = 1;  // Direction: down = 1, up = -1
        
        for (int i = 0; i < s.length(); i++) {
            strings[index].append(s.charAt(i));
            
            // Change direction at the top or bottom
            if (index == 0) {
                step = 1;
            } else if (index == numRows - 1) {
                step = -1;
            }
            
            index += step;
        }
        
        // Combine all rows
        StringBuilder res = new StringBuilder();
        for (StringBuilder sb : strings) {
            res.append(sb);
        }
        
        return res.toString();
    }
}
