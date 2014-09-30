/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author matychp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(addFibonacciEvenValues(40));
        System.out.println(addFibonacciEvenValuesBetter(40));
       
    }

    public static long addFibonacciEvenValues(int n) {
        int t0 = 1, t1 = 2, ta = 3;
        long suma = t1;
        while (ta < n) {
            if (ta % 2 == 0) {
                suma += ta;
            }
            t0 = t1;
            t1 = ta;
            ta = t1 + t0;
        }
        return suma;
    }

    public static long addFibonacciEvenValuesBetter(int n) {
        int t0 = 1, t1 = 2, ta = 3;
        long suma = t1;
        while (ta < n) {
            t0 = t1;
            t1 = ta;
            ta = t1 + t0;

            t0 = t1;
            t1 = ta;
            ta = t1 + t0;

            suma += ta;
            t0 = t1;
            t1 = ta;
            ta = t1 + t0;
        }
        return suma;
    }
}
