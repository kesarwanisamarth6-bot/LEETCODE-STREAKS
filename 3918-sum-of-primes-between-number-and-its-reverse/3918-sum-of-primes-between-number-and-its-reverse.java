class Solution {
    public static int checkPrime(int n) {
    if (n <= 1) return 0;

    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return 0;
        }
    }

    return n;
}
    
    public int sumOfPrimesInRange(int n) {
    int temp = n;
    int r=0;
        while(temp!=0){
            r=r*10+temp%10;
            temp=temp/10;
        }
        
    int min = Math.min(n,r);
    int max = Math.max(n,r);
    int sum = 0;
    for(int i = min;i<=max;i++){
    sum=sum+checkPrime(i);
    }
        return sum; 
    }
}