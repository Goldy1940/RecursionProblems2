import java.util.*;

public class All_Indices {

    static ArrayList<Integer> ls =new ArrayList<>();
    public static void main(String[] args)
    {
        int[] array={1,2,1,3,1};
        System.out.println(allIndices(array,0,0));
    }
    static ArrayList<Integer> allIndices(int[] arr,int target,int ind) {
        if (arr.length == ind)
            return ls ;
        if (arr[ind] == target)
        {
            ls.add(ind);
        }
        return allIndices(arr,target,ind+1);
    }
}
