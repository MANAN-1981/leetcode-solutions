class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int rows = items.size();

        int max = 0;

        if (ruleKey.equals("type")) {
            for (int i = 0; i < rows; i++) {
                if (items.get(i).get(0).equals(ruleValue)) {
                    max++;
                }
            }
        } else if (ruleKey.equals("color")) {
            for (int i = 0; i < rows; i++) {
                if (items.get(i).get(1).equals(ruleValue)) {
                    max++;
                }
            }
        } else {
            for (int i = 0; i < rows; i++) {
                if (items.get(i).get(2).equals(ruleValue)) {
                    max++;
                }
            }
        }

       return max;

    }
}