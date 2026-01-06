
package DSA;

public class HanoiTower {

    static void hanoi(int n, char from, char to, char aux) {
        // Base case
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }

        // Move n-1 disks to auxiliary rod
        hanoi(n - 1, from, aux, to);

        // Move nth disk
        System.out.println("Move disk " + n + " from " + from + " to " + to);

        // Move n-1 disks from auxiliary to destination
        hanoi(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        int n = 3;
        hanoi(n, 'A', 'C', 'B');
    }
    
}
