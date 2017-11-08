package Stack;

public class IntStack{
    private int[] stack;
    private int top, size;
    
    //Default Constructor
    public IntStack (){
        top = -1;
        size = 50;
        stack = new int[size];
    }
    
    //Constructor with Stack size initializr
    public IntStack(int size){
        top = -1;
        this.size = size;
        stack = new int[size];
    }
    
    //Checks if the Stack is Full
    public boolean isFull(){
        return (top == stack.length -1);
    }
    
    //Checks if the Stack is empty
    public boolean isEmpty(){
        return top == -1;
    }
    
    //Adds items in the stack
    public void push(int item){
        if(!isFull()){
            top++;
            stack[top] = item;
        }
        else
            System.out.println("Stack is Full");
    }
    
    //Removes items from stack
    public int pop(){
        return stack[top--];
    }
    
    //Returns the first item in the Stack
    public int peek(){
        return stack[top];
    }
}
