import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args)
    {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={3,45};

        System.out.println(Arrays.toString(merge(arr1,arr2)));
    }
    static int[] merge(int[] arr1 , int[] arr2)
    {
        // assume that both arrays are sorted

        int[] mergedArray = new int [arr1.length+arr2.length];

        int i=0,j=0,k=0;

        while(i<arr1.length && j<arr2.length )
        {
            if(arr1[i]<arr2[j])
            {
                mergedArray[k]=arr1[i];
                k++;
                i++;
            }
            else {
                mergedArray[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<arr1.length)
        {
            mergedArray[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length)
        {
            mergedArray[k]=arr2[j];
            k++;
            j++;
        }
        return mergedArray;
    }
}
