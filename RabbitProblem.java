/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DSA;

/**
 *
 * @author DELL
 */
public class RabbitProblem {



    static int rabbits(int n) {
        // Base cases (as per PDF)
        if (n == 0) return 1; // 1 baby pair
        if (n == 1) return 1;

        // Recursive case
        return rabbits(n - 1) + rabbits(n - 2);
    }

    public static void main(String[] args) {
        int months = 12;
        System.out.println("Rabbit pairs after " + months + " months = " + rabbits(months));
    }
}

    

