/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kunal
 */
public class testDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(22);
        ComparableCircle c2 = new ComparableCircle(25);
        int result = c1.compareTo(c2);
        if (result == 1){
            System.out.println("print c1 is bigger than c2");}
        else {
            System.out.println("print c2 is bigger than c1");}
        
        
    }
    
}
