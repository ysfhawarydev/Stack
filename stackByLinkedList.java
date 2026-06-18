public class stackByLinkedList {
  private Node top;

  private class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public stackByLinkedList() {
    this.top = null;
  }

  public void push(int item) {
    Node newNode = new Node(item);
    newNode.next = top;
    top = newNode;
  }

  public int pop() {
    if (top != null) {
      int item = top.data;
      top = top.next;
      return item;
    } else {
      System.out.println("Stack is empty");
      return -1; // Return -1 to indicate stack is empty
    }
  }

  public int peek() {
    if (top != null) {
      return top.data;
    } else {
      System.out.println("Stack is empty");
      return -1; // Return -1 to indicate stack is empty
    }
  }

  public boolean isEmpty() {
    return (top == null);
  }

  public static void main(String[] args) {
    stackByLinkedList stack = new stackByLinkedList();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    System.out.println("Top element: " + stack.peek());
    System.out.println("Popped element: " + stack.pop());
    System.out.println("Top element after pop: " + stack.peek());
  }
}