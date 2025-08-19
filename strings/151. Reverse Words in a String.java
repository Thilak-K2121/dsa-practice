class Solution {
    public String reverseWords(String s) {
        char chars[] = s.toCharArray();
        int n = chars.length;

        n = cleanSpaces(chars, n);

        reverse(chars, 0, n - 1);

        int start = 0;
        for (int end = 0; end < n; end++) {
            if (chars[end] == ' ') {
                reverse(chars, start, end - 1);
                start = end + 1;
            } else if (end == n - 1) {
                reverse(chars, start, end);
            }
        }

        return new String(chars,0,n);

    }

    private int cleanSpaces(char chars[], int n) {
        int i = 0, j = 0;
        while (j < n) {
            while (j < n && chars[j] == ' ')
                j++;
            while (j < n && chars[j] != ' ')
                chars[i++] = chars[j++];
            while (j < n && chars[j] == ' ')
                j++;
            if (j < n)
                chars[i++] = ' ';
        }

        return i;
    }

    private void reverse(char chars[], int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
    }
}
