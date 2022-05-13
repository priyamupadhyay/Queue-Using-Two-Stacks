// Queue with two stacks. Implement a queue with two stacks so that each queue operations takes a
// constant amortized number of stack operations. Hint: If you push elements onto a stack and then 
// pop them all, they appear in reverse order. If you repeat this process, they're now back in order.
import java.io.*;
import java.util.*;

class Queue {
    private Stack<Integer> obj1;
    private Stack<Integer> obj2;

    public Queue() {
        obj1=new Stack<Integer>();
        obj2=new Stack<Integer>();
    }

    // Push element x to the back of queue.
    public void enqueue(int x) {
        while (!obj1.isEmpty()) {
            obj2.push(obj1.pop());
        }
        obj1.push(x);
        while (!obj2.isEmpty()) {
            obj1.push(obj2.pop());
        }
    }

    // Removes the element from in front of queue.
    public int dequeue() {
        return obj1.pop();
    }
    
    // Get the front element.
    public int peek() {
        return obj1.peek();
    }
    
    // Return whether the queue is empty.
    public boolean empty() {
        return (obj2.isEmpty() && obj1.isEmpty());
    }

    // Return the number of elements in queue.
    public int size() {
        return obj1.size();
    }
    
    public static void main(String[] args) {

        Queue queue = new Queue();

    }
}
