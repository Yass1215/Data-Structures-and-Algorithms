/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dns;

 import java.util.ArrayDeque; 
import java.util.Deque;

public class DequeAc {

    public static void main(String[] args) {
        Deque<String> fruits = new ArrayDeque<>(); 
        fruits.add("Apple"); 
        fruits.add("Banana"); 
        fruits.add("Mango"); 
    System.out.println(fruits); 

    fruits.add("Cherry"); 
    System.out.println(fruits);
    
    fruits.removeLast(); 
    System.out.println(fruits);
    
    System.out.println(fruits.peekFirst()); 
    fruits.removeFirst(); 
    
    System.out.println(fruits);
    }
    
}
