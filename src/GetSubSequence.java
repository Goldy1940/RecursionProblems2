import java.util.ArrayList;
import java.util.Scanner;

public class GetSubSequence {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=sc.next();
        ArrayList<String> result=gss(str);
        System.out.println(result);

    }
    public static ArrayList<String> gss(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch=str.charAt(0);
        String res=str.substring(1);
        ArrayList<String> rress=gss(res);

        ArrayList<String> mres=new ArrayList<>();
        for(String rstr : rress)
        {
            mres.add(""+rstr);
            mres.add(ch+rstr);
        }
        return mres;
    }
}
