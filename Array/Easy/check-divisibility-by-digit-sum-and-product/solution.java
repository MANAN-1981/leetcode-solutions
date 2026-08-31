class Solution {
    public boolean checkDivisibility(int n) {
        
        int num = n;
        int mulNum = n;
        int sum = 0;
        int mul = 1;

         while(num!=0){
            sum += num%10;  
            num = num/10;
            
            mul *= mulNum%10;  
            mulNum = mulNum/10;
        }

        if(n % (sum+mul) == 0){
            return true;
        }
        return false;
    }
}