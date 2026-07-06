class Solution {

    // public int solve(int n) {
    //     if (n == 1) {
    //         return 0;
    //     }

    //     int a, b;

    //     if (n % 2 == 0) {
    //         a = n / 2;
    //         b = n / 2;
    //     } else {
    //         a = 1;
    //         b = n - 1;
    //     }

    //     return (a * b) + solve(a) + solve(b);
    // }

    public int minCost(int n) {
        return n*(n-1)/2;
    }

}