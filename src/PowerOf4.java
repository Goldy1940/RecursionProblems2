public class PowerOf4 {
    public static void main(String[] args)
    {
        System.out.println(isPowerOfFour(1));
    }
    public static boolean isPowerOfFour(int n) {
        return check(n,0);
    }
    static boolean check(int n,int x)
    {
        long result= (long) Math.pow(4,x);
        if(result>n)
        {
            return false;
        }
        if(x==Integer.MAX_VALUE)
            return false;
        if(result==n)
            return true;
        return check(n,x+1);
    }
}
