/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dns;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueAc {

    public static void main(String[] args) {
        Queue<Integer> pQueue = new PriorityQueue<>();
        
        pQueue.add(20);
        pQueue.add(10);
        pQueue.add(15);
        
        System.out.println(pQueue);
        
        int size = pQueue.size();
        for (int i = 0; i < size; i++)
            System.out.println(pQueue.poll());
    }
    
}
