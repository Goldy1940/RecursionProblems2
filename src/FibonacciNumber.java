public class FibonacciNumber {
    public static void main(String[] args)
    {
        System.out.println(ans(6));
    }
    static public int fib(int n) {
        return ans(n);
    }
    static int ans(int n)
    {
        if(n<2)
            return n;
        return ans(n-1)+ans(n-2);
    }
}
