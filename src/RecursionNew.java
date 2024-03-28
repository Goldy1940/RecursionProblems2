public class RecursionNew {
    public static void main(String[] args)
    {
        pizz(2);
    }
    public static void pizz(int n)
    {
        if(n==0)
            return;
        System.out.println("Pre"+n);
        pizz(n-1);
        System.out.println("IN"+n);
        pizz(n-1);
        System.out.println("Post"+n);
    }
}
