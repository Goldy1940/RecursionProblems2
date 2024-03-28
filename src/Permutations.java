public class Permutations {
    public static void main(String[] args)
    {
        String str="abc";
        printPermutations(str,"");
    }
    static void printPermutations(String ques,String asf)
    {
        if(ques.length()==0)
        {
            System.out.println(asf);
            return;
        }
        for(int i=0;i<ques.length();i++)
        {
            char ch=ques.charAt(i);
            String qlpart=ques.substring(0,i);
            String rpart=ques.substring(i+1);

            String roq=qlpart+rpart;

            printPermutations(roq,asf+ch);
        }

    }
}
