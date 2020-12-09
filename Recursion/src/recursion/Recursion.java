/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author kunal
 */
public class Recursion {

    public int n;
      // iterative function to calculate factorial
      public static int factByIteration(int n) {
        int i = 0;
        int ans = 1;
        for (i = n; i > 0; i--) {
            ans = ans * i;
        }
        return ans;
    }
      // recursive factorial method
      public static int factByRecursion(int n){
        
          if(n == 0){
          return 1;
          }
          else {return n*factByRecursion(n-1);
          }
      }
      // recursive method has no base case
        public static int infinteFact(int n){ 
               return n*infinteFact(n-1);
        }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        

        System.out.println("Factorial by iteration:" + Recursion.factByIteration(4));
        System.out.println("Factorial by recursion:" + Recursion.factByRecursion(4));
        System.out.println("Trying Recursion without base case:- ");
        System.out.println(Recursion.infinteFact(5));
  
}
}
