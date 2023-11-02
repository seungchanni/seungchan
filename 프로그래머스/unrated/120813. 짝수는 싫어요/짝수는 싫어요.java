class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2];
        int oddNumber = 1;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = oddNumber;
            oddNumber += 2;
        }
        return answer;
    }
}