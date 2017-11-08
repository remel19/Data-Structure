import Stack.IntStack;

public class Main{
    public static void main (String args[]){
       
        //Testing Stack Class
        IntStack stack = new IntStack();
        stack.push(2);
        stack.push(500);
        stack.push(4);
        stack.push(1235);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //
    }
}
