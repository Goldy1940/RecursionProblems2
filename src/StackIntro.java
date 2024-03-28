import java.util.Stack;
public class StackIntro {
    public static void main(String[] args)
    {
        Stack<String> stack =new Stack<>();

        System.out.println(stack.isEmpty());

        stack.push("FarCr3");
        stack.push("Far Cry 4");
        stack.push("Minecraft");
        stack.push("Doom");

        System.out.println(stack.isEmpty());

        System.out.println(stack);


       System.out.println(stack.peek());

       System.out.println(stack.search("Far Cry 4"));



        System.out.println(stack);
    }

}
