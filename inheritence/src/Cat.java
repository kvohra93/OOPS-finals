/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunal
 */
public class Cat extends Pet{
    private String catBreed;
    private boolean hasPreviousOwner;
    
    public Cat(String petName,String petSince, String catBreed, boolean hasPreviousOwner){
        super(petName,petSince);
        this.catBreed = catBreed;
        this.hasPreviousOwner = hasPreviousOwner;
    }
    
     public void meow(){
        System.out.println(super.petName + " the cat says hi!");
        }
     
    @Override
    public String toString(){
    
    return (super.toString() + ". " + super.getPetName() + " is of " + this.catBreed + " type");
    }
    
}
