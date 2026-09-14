class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        for(int i=0; i<items.size(); i++){
                if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)){
                    result++;
                }
                else if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)){
                    result++;
                }
                else if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)){
                    result++;
                }
        }
        return result;
    }
}

//Another Solution
/*
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        for(List<String> arr : items){
                if(ruleKey.equals("type") && arr.get(0).equals(ruleValue)){
                    result++;
                }
                else if(ruleKey.equals("color") && arr.get(1).equals(ruleValue)){
                    result++;
                }
                else if(ruleKey.equals("name") && arr.get(2).equals(ruleValue)){
                    result++;
                }
        }
        return result;
    }
}
*/