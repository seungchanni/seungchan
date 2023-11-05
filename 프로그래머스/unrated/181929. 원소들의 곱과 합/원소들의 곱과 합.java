class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int sum=0; //합
        int gop=1; //곱
        
        for(int i=0;i<num_list.length;i++){
            sum+=num_list[i];
            gop*=num_list[i];
        }
        
        if(gop>(sum*sum)){
            answer=0;
        }
        else{
            answer=1;
        }
        
        
        return answer;
    }
}