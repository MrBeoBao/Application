
package ex4;

import java.util.Date;


public class MeetingRoom extends Room{
    private int capacity;

    public MeetingRoom(int capacity, String id, String name, double baseCost, Date checkinDate, Date checkoutDate) {
        super(id, name, baseCost, checkinDate, checkoutDate);
        this.capacity = capacity;
    }

    public MeetingRoom() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    public void addRoom( ) {
        super.addRoom();
        System.out.print("Enter capacity: ");
        capacity = s.nextInt();
        s.nextLine();
    }
    @Override 
    public void updateRoom(){
        super.updateRoom();
        System.out.print("Enter capacity: ");
        capacity = s.nextInt();
        s.nextLine();
    }
    @Override
    public void displayDetails ( ){
        super.displayDetails();
        System.out.println("Capacity: " + capacity);
        
    }
    @Override
    public double calculateCost ( ){
        double cost = getBaseCost() * calculateDaysOfStay();
        if(capacity >= 3) return cost * 1.1;
        else return cost;
    }
    
}
