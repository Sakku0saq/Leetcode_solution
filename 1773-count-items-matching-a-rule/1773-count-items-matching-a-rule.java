class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int indexRule=0;
        int count=0;
        if(ruleKey.equals("type")){
            indexRule=0;
        }else if(ruleKey.equals("color")){
            indexRule=1;
        }
        else{
            indexRule=2;
        }
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(indexRule).equals(ruleValue)){
                count++;
            }
        }

        return count;
    }
}