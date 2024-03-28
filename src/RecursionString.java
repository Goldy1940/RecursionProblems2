public class RecursionString {
    public static void main(String[] args)
    {
        String str="aabbccddeeccddcc";
        System.out.println(skip(str));
    }
    static String skip(String str)
    {
        if(str.isEmpty())
        {
            return"";
        }

        char ch=str.charAt(0);

        if(ch=='c')
        {
            return skip(str.substring(1));
        }
        else
            return ch+skip(str.substring(1));
    }
}
