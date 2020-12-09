/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomarray;

import java.util.Scanner;

/**
 *
 * @author kunal
 */
public class RandomArray {

    public static void main(String[] args) {

        int[] randArray = new int[100];
        for (int i = 0; i < 100; i++) {
            randArray[i] = (int) (Math.random() * 100);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the index of the array you want to display: ");
        int temp = scanner.nextInt();
        // try catch block if user specifies wrong value
        try {
            System.out.println(randArray[temp - 1]);
        } catch (Exception e) {
            System.out.println("Out of bounds for the100 specified array");

        }

    }

}
