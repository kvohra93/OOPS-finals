/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;
import java.util.Scanner;
/**
 *
 * @author kunal
 */
public class RecursiveSearch {
   
    static int recSearch(int[] numberList, int last, int n){
        
    // base case    
        if(last <= -1){
        return -1;
        }
        if (numberList[0] == n){
        return 0;
        }
        if (numberList[last] == n){
        return last;
    }
    // recursive call
        return recSearch(numberList, last-1, n);
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int listLength = 0;
        System.out.println("Enter length of list: ");
        listLength = scanner.nextInt();
        int[] numberList = new int[listLength];
        scanner.nextLine();
        System.out.println("enter elements of array 1 number on each line:");
        for (int i = 0; i<listLength; i++)
        {
            numberList[i] = scanner.nextInt();
            scanner.nextLine();
        }
        int n = 0;
        System.out.print("input element u want to find in the list of numbers: ");
        n = scanner.nextInt();
        scanner.close();
        
        int position =RecursiveSearch.recSearch( numberList,listLength-1,n );
        if(position == -1){
            System.out.println("Element not present in list of numbers");
        }
        
        else if(position !=-1)  {
            System.out.println("Element present at index " + position);
        }
        
    }
    
}
