import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args)
    {
        int[] arr= { 10,9,8,7,6,5,43,2,123,1000,234};
       int[] ans=sortArray(arr);
         System.out.println(Arrays.toString(ans));
    }
    static int[] sortArray(int[] nums) {
       int[] ans= sort(nums);
       return ans;

    }
    static int[] sort(int[] nums)
    {
        if(nums.length==1)
            return nums;

        int mid=nums.length/2;

        int[] left=sortArray(Arrays.copyOfRange(nums,0,mid));
        int[] right=sortArray(Arrays.copyOfRange(nums,mid,nums.length));

        return merged(left,right);
    }
    static int[] merged(int[] first, int[] second)
    {
        int i=0;
        int j=0;
        int k=0;

        int[] mix=new int[first.length+second.length];

        while(i<first.length && j<second.length)
        {
            if(first[i]<second[j])
            {
                mix[k]=first[i];
                k++;
                i++;
            }
            else
            {
                mix[k]=second[j];
                k++;
                j++;
            }
        }
        while(i<first.length)
        {
            mix[k] = first[i];
            k++;
            i++;
        }
        while(j<second.length)
        {
            mix[k]=second[j];
            k++;
            j++;
        }
        return mix;

    }
}
