/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DSA;
import java.util.Arrays;

public class UnboundedArrayStack {
    private int[] arr;
    private int top;

    public UnboundedArrayStack() {
        arr = new int[2]; // start with small size
        top = -1;
    }

    // Push operation
    void push(int x) {
        if (top == arr.length - 1) {
            // double the size
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
        arr[++top] = x;
    }

    // Pop operation
    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        int popped = arr[top--];
        if (top + 1 <= arr.length / 4 && arr.length > 2) {
            // shrink array
            arr = Arrays.copyOf(arr, arr.length / 2);
        }
        return popped;
    }

    public static void main(String[] args) {
        UnboundedArrayStack stack = new UnboundedArrayStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.pop()); // 40
        System.out.println(stack.pop()); // 30
    }
    
}
