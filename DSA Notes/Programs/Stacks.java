import java.util.Stack;

public class Stacks{

    public static void main(String[] args){

        Stack<String> stack = new Stack<String>();

        //System.out.println("The Stack is empty? " + stack.isEmpty());


        stack.push("GTA V");
        stack.push("Minecraft");
        stack.push("The Witcher 3");
        //System.out.println("The Stack is empty? " + stack.isEmpty());

        //String Fav_Game = stack.pop();
        //System.out.println(Fav_Game);
        
        System.out.println(stack.peek());

        System.out.println(stack.search("Minecraft"));

        System.out.println(stack);


    }

}