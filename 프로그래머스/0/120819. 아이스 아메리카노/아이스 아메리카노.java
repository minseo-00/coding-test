class Solution {
    public int[] solution(int money) {
        int coffee = 5500;
        int count = money / coffee;
        int price = money % coffee;
        
        return new int[]{count, price};
    }
}