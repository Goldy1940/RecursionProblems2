public class ArrayReverse {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        reverse(arr,0);
    }
    public static void reverse(int[] arr,int idx)
    {
        if(idx==arr.length-1)
        {
            System.out.println(arr[idx]);
            return;
        }
        reverse(arr,idx+1);
        System.out.println(arr[idx]);

    }
}
