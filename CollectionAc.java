/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dns;

import java.util.LinkedList;
import java.util.Collection;

public class CollectionAc {
    public CollectionAc(){
        Collection c = new LinkedList();
        c.add(5);
        c.add(3);
        System.out.println(c.isEmpty());
        System.out.println(c.size());
        System.out.println(c.contains(5));
        c.remove(5);
        System.out.println(c);
    }
    
    public static void main(String[] args) {
        new CollectionAc();
    }
    
}
