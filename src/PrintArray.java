public class PrintArray {
    public static void main(String[] args) throws Exception {
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        displayArr(arr,10);
    }
    static void displayArr(int[] arr,int idx)
    {
        if(idx<=0) {
            System.out.println(arr[idx]);
            return;
        }
        System.out.println(arr[idx-1]);
        displayArr(arr,idx-1);
        System.out.println(arr[idx-1]);


    }
}
