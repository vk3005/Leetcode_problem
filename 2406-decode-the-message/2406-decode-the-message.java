class Solution {
    public String decodeMessage(String key, String msg){
        char[] sub = new char[26];
        Arrays.fill(sub,'#');

        char alpha = 'a';
        for(char ch:key.toCharArray()){
            if(ch != ' ' && sub[ch-'a']=='#')
            sub[ch-'a']=alpha++;

        }
        StringBuilder s = new StringBuilder();
        for(char ch : msg.toCharArray()){
            if(ch==' ')
            s.append(ch);
            else
            s.append(sub[ch-'a']);

        }
        return s.toString();
        
    }
}