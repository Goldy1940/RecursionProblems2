public class TowerOfHanoi {
    public static void main(String[] args) throws Exception
    {

    }
    public static void toh(int n,int t1,int t2,int t3)
    {
        toh(n-1 ,t1,t3,t2);
        {
            System.out.println(n+" [" +t1+ " -> "+t2 + "]");

        }
    }
}
