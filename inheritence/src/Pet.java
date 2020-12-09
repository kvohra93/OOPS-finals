
/**
 *
 * @author Kunal
 */
public class Pet {
    public String petName;
    public String petSince;
    
    public Pet(String petName,String petSince){
        this.petName=petName;
        this.petSince = petSince;
    }

    public String getPetName() {
        return petName;
    }
    

    public String getPetSince() {
        return petSince;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetSince(String petSince) {
        this.petSince = petSince;
    }
    
    
    public String toString(){
        return(petName + " is a pet since " + petSince);
                
    }
}
