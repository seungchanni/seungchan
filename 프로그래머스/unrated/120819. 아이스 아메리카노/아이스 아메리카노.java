class Solution {
    public int[] solution(int money) {
        int[] answer =new int[2];
        
        // 아이스 아메리카노 가격 5500
        // 입력받은돈 / 5500 이거는 몇개 살수있는지
        // 입력받은돈 % 5500 이거는 거스름돈
        int coffee = 5500;
        
        answer[0]=money/coffee;
        answer[1]=money%coffee;
        
        return answer;
    }
}