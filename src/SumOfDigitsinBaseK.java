public class SumOfDigitsinBaseK {
    public static void main(String[] args)
    {
        int n=34;
        int k=6;

        int sum=0;

        while(n>0)
        {
            int d=n%k;
            sum+=d;

            n/=k;
        }
        System.out.println(sum);
    }
}
