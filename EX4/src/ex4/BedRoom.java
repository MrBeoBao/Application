
package ex4;

import java.util.Date;

public class BedRoom extends Room{
    private int numberOfBeds;

    public BedRoom() {
    }
    
    public BedRoom(int numberOfBeds, String id, String name, double baseCost, Date checkinDate, Date checkoutDate) {
        super(id, name, baseCost, checkinDate, checkoutDate);
        this.numberOfBeds = numberOfBeds;
    }

    

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
    @Override
    public void addRoom( ) {
        super.addRoom();
        System.out.print("Enter numberOfBeds: ");
        numberOfBeds = s.nextInt();
        s.nextLine();
    }
    @Override 
    public void updateRoom(){
        super.updateRoom();
        System.out.print("Enter numberOfBeds: ");
        numberOfBeds = s.nextInt();
        s.nextLine();
    }
    @Override
    public void displayDetails ( ){
        super.displayDetails();
        System.out.println("numberOfBeds: " + numberOfBeds);
        
    }
    @Override
    public double calculateCost ( ){
        double cost = getBaseCost() * calculateDaysOfStay();
        if(numberOfBeds >= 3) return cost * 1.1;
        else return cost;
    }
    
}
