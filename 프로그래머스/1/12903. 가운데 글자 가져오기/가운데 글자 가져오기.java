class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length() % 2 == 1){ //홀수
            answer=Character.toString(s.charAt(s.length()/2));
        }
        else{ // 짝수
            answer=Character.toString(s.charAt((s.length()/2)-1))+Character.toString(s.charAt(s.length()/2));
        }
        return answer;
    }
}