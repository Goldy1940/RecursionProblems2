public class LastIndex {
    public static void main(String[] args)
    {
        int[] array={1,2,1,2,3,4,5,2,3,2,4,6,7,10,2,3,2};
        int len=array.length;
        System.out.println("The length of entered array is "+len);
        System.out.println(last(array,2,len));
    }
    public static int last(int[] arr,int target,int i)
    {
        if(i<0)
            return -1;
        if(arr[i-1]==target)
            return i-1;
        return last(arr, target, i - 1);
    }
}
