import java.util.EmptyStackException;
 class CustomStack {
    private int[] stackArray;
    private int top;
    private int capacity;
    public CustomStack(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1;
    }
    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow: Stack is full.");
        } else {
            stackArray[++top] = item;
            System.out.println("Pushed: " + item);
        }
    }
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            int poppedItem = stackArray[top--];
            System.out.println("Popped: " + poppedItem);
            return poppedItem;
        }
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Is stack empty? " + stack.isEmpty());
        stack.pop();
        stack.pop();
        stack.pop();
        try {
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Stack Underflow: " + e.getMessage());
        }
    }
}