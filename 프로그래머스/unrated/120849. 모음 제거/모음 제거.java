class Solution {
    public String solution(String my_string) {
        
        String[] a = {"a", "e", "i", "o", "u"};
        
        for(int i=0;i<a.length;i++){
            my_string= my_string.replace(a[i],"");
        }
        
        return my_string;
    }
}