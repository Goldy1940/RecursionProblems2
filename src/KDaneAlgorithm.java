public class KDaneAlgorithm {
    public static void main(String[] args)
    {
        int[] arr={-5,-4,-1,-7,-8};
        System.out.println(maxSubArray(arr));
    }
    static int maxSubArray(int[] nums) {
        int currSum=0;
        int maxSum=-999999999;


        for(int i=0;i<nums.length;i++)
        {
            currSum+=nums[i];
            if(currSum>maxSum)
                maxSum=currSum;
            if(currSum<0)
            {

                currSum=0;
            }

        }
        return maxSum;
    }
}
