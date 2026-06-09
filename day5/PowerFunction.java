public class PowerFunction {
    double power(double b, long e){
        if(e == 0) return 1;

        if(e < 0 ) return 1/power(b,-e);
        
        double temp = power(b,e/2); 
        if(e%2 == 0) return temp*temp;
        return b*temp*temp;
    }
    public double myPow(double x, int n) {
        return power(x,n);   
    }
}