public class SubStringIntro {
    public static void main(String[] args)
    {
        String name="PowerRangers";

        int len=name.length();

        String sub=name.substring(4);
        String sub2=name.substring(2,len);

        System.out.println(sub);
        System.out.println(sub2);
    }
}
