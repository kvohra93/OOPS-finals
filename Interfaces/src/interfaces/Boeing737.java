/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author kunal
 */
public class Boeing737 implements Plane,Fly{

    @Override
    public void isCommercial() {
        System.out.println("Boeing 737 is a commercial plane");
    }

    @Override
    public void isFlying() {
        System.out.println("Boeing 737 is currently used technology");
    }
    
    
}
