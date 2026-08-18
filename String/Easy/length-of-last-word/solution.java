class Solution {
    public int lengthOfLastWord(String s) {
        s.strip();
        String[] words = s.split(" ");

        int n = words.length;

        String last = words[n-1];

        return last.length();
    }
}