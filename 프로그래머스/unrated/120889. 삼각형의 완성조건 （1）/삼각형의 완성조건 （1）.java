import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        // 최대값구해서 
        // 최대값을 제외한 다른 애들 더하고 
        // 나온값과 최대값을 비교
        // 최대값이 크다면 가능 1
        // 최대값이 작다면 불가능 2
        
        Arrays.sort(sides);
        
        int maxScore = sides[sides.length-1];
        int sumScore = 0;
        
        for(int i=0;i<sides.length-1;i++){
            sumScore+=sides[i];
        }
        
        if(maxScore>=sumScore){
            answer=2;
        }else{
            answer=1;
        }
        
        return answer;
    }
}