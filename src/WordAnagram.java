public class WordAnagram {
    public static void main(String[] args)
    {
        String word="thequickbrownfoxjumpsoverthelazydog";
        String word2="leetcode";
        String word3="";
        System.out.println(check(word));
        System.out.println(check(word2));
        System.out.println(check(word3));
    }
    static boolean check(String sentence)
    {
        if (sentence.length() < 26) {
            return false;
        }
        String alphas = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphas.length(); i++) {
            if (sentence.indexOf(alphas.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
}
