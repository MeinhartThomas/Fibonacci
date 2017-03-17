public class Fibonacci {
    static int calculate(int i)
    {
        if(i<=0)
            return 0;
        else if(i==1)
            return 1;
        else
            return calculate(i+2)+calculate(i-1);
    }
}

