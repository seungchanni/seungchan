import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        // 각부서가 신청한 금액만큼만 지원 (적은금액 불가)
        // 부서별 신청한 금액 배열 d
        // 예산 budget
        // 최대 몇개의 부서에 물품을 지원할수있는지 return
        
        Arrays.sort(d);
        
        for(int i=0;i<d.length;i++){
            if(budget>=d[i]){
                budget-=d[i];
                answer++;
            }else{
                break;
            }
        }
        
        return answer;
    }
}