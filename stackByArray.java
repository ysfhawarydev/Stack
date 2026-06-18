public class stackByArray {
  int maxSize;
  int[] stackArray;
  int top;

  public stackByArray(int size) {
    this.maxSize = size;
    this.stackArray = new int[maxSize];
    this.top = -1;
  }

  public void push(int item) {
    if (top < maxSize - 1) {
      stackArray[++top] = item;
    } else {
      System.out.println("Stack is full");
    }
  }

  public int pop() {
    if (top >= 0) {
      return stackArray[top--];
    } else {
      System.out.println("Stack is empty");
      return -1; // Return -1 to indicate stack is empty
    }
  }

  public int peek() {
    if (top >= 0) {
      return stackArray[top];
    } else {
      System.out.println("Stack is empty");
      return -1; // Return -1 to indicate stack is empty
    }
  }

  public boolean isEmpty() {
    return (top == -1);
  }

  public boolean isFull() {
    return (top == maxSize - 1);
  }
  public static void main(String[] args) {
    stackByArray stack = new stackByArray(5);
    stack.push(10);
    stack.push(20);
    stack.push(30);
    System.out.println("Top element: " + stack.peek());
    System.out.println("Popped element: " + stack.pop());
    System.out.println("Top element after pop: " + stack.peek());
  }
}