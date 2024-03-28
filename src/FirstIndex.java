public class FirstIndex {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7,5,6,3,4,57,8};
        System.out.println(first(arr,10,0));
    }
    static int first(int[] arr,int target,int n)
    {
        if(arr.length==n)
            return -1;
        if(arr[n]==target)
            return n;
       return first(arr,target,n+1);
    }
}
