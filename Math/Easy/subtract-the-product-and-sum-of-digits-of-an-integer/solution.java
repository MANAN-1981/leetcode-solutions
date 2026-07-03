class Solution {
    public int subtractProductAndSum(int num) {
        int rem = 0;
        int mul = 1;
        int sum = 0;
        
        
        while(num != 0){
            rem = num%10;
            sum += rem;
            mul *= rem;
            num = num/10;
        }
        return mul-sum;
    }
}