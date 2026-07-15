class Solution {

     public static int sumOdd(int a){
        int sum = 0;
        int count = 0;
        int num = 1;

        while (count < a) {
            sum += num;
            num += 2;
            count++;
        }
        return sum;
    }
    
    public static int sumEven(int a){
        int sum = 0;
        int count = 0;
        int num = 2;

        while (count < a) {
            sum += num;
            num += 2;
            count++;
        }
        return sum;
    }
   
    public static int GCD(int a , int b){
        
         if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }


    public int gcdOfOddEvenSums(int n) {
        
        int odd = sumOdd(n);
	    int even = sumEven(n);
	    int answer = GCD(odd,even);

        return answer;
    }
}