class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for(String word : strs){
            int len = word.length();
            result += len + "#"+word;
        };
        return result; 
    }

    public List<String> decode(String str) {
        List<String> result;
        for(int i=0 ; i<str.length(); i++){
            if()
        } 

        }
}
