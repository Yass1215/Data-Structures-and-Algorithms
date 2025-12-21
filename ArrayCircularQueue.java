/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DSA;

class ArrayCircularQueue {

    int[] queue;
    int front = -1, rear = -1;
    int size;

    ArrayCircularQueue(int size) {
        this.size = size;
        queue = new int[size];
    }

    // Enqueue
    void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1) front = 0;

        rear = (rear + 1) % size;
        queue[rear] = data;
    }

    // Dequeue
    int dequeue() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int value = queue[front];

        if (front == rear) {
            front = rear = -1; // reset
        } else {
            front = (front + 1) % size;
        }

        return value;
    }

    public static void main(String[] args) {
        ArrayCircularQueue cq = new ArrayCircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);

        System.out.println(cq.dequeue()); // 10
        System.out.println(cq.dequeue()); // 20
    }
}

