/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunal
 */
public class Dog extends Pet {
    
    private String foodName;
    private boolean isRescueDog;
    
    public Dog(String petName, String petSince,String foodName, boolean isRescueDog){
        super(petName,petSince);
        this.foodName=foodName;
        this.isRescueDog = isRescueDog;
    }
    public void bark(){
        System.out.println(super.petName + " is barking");
        }
    
      @Override
    public String toString() {
        return (super.toString()+ ". The food for " + super.getPetName() + " is " + this.foodName);
    }
    
}
