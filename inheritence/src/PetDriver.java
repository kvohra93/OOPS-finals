/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunal
 */
public class PetDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Pet p1 = new Pet("Toby", "2016");
       Dog d1 = new Dog("Rasmus", "2018","Royal Canine",true);
       Cat c1 = new Cat ("Billy", "2015", "Domestic Short Haired", false );
       
       Dog d2= new Dog("Duke","2020","Pedigree",true);
       // creating pet object p1
       Pet p1;
       
       // polymorphic substitution of Dog object as a Pet object
       p1 = d2;
       // typecasting dog object d2 as Dog form of p1
       d2 = (Dog)p1;
       
       //technically d2 is dog form of p1 so late binding of p1 prints toString of Dog
       System.out.println(d2.toString());
 
       System.out.println(d1.toString());
       
       System.out.println(c1.toString());
       
       d1.bark();
       c1.meow();
    }
    
}
