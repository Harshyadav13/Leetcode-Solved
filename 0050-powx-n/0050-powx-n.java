class Solution {
    
    public double power(double x, long n) {
        if(n == 0) return 1.0;
        
        double temp = power(x, n/2);
        
        if(n % 2 == 0) {
            return temp * temp;
        }
        else {
            return temp * temp * x;
        }
    }
    
    public double myPow(double x, int n) {
        if(n < 0) {
            double tmp = power(x, -n);
            return 1.0 / tmp;
        }
        return power(x, n);
    }
}