class Solution {
    public int climbStairs(int n) {
        if(n<4) return n;
        return fibo(n,2,3);
    }
    int fibo(int n, int i, int j)
    {
        if(n==4) return i+j;
        return fibo(n-1, j, i+j);
    }
}