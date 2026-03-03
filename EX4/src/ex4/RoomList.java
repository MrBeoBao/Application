
package ex4;

import java.util.ArrayList;

public class RoomList {
    private ArrayList<Room> list = new ArrayList<>();
    public void addRoom(Room r){
        list.add(r);
    }
    public void updateRoomById(String id){
        boolean found = false;
        for(Room r : list){
            if(r.getId().equals(id)){
                r.updateRoom();
                System.out.println("Updated");
                found = true;
                break;
            }
            
        }
        if(!found) System.out.println("Not found");
    }
    public void deleteRoomById(String id){
        boolean found = false;
        for(int i = 0 ; i < list.size(); i++){
            if(list.get(i).getId().equals(id)){
                list.remove(i);
                System.out.println("Deleted");
                found = true;
                break;
            }
        }
        if(!found) System.out.println("Not found");
    }
    public void findRoomById(String id){
        boolean found = false;
        for(Room r : list){
            if(r.getId().equals(id)){
                r.displayDetails();
                found = true;
                break;
            }
            
        }
        if(!found) System.out.println("Not found");
    }
    
    public void displayAllRooms(){
        for(Room r : list){
            r.displayDetails();
            System.out.println("------------------");
        }
    }
    public Room findMostExpensiveRoom(){
        
        Room r = null;
        for(Room i : list){
            if(r == null || r.calculateCost() < i.calculateCost()){
                r = i;
            }
        }
        
        return r;
    }
    public void countRooms(){
        int meeting = 0;
        int bed = 0;
        for(Room r : list){
            if(r instanceof MeetingRoom){
                meeting++;
            }
            else
            if(r instanceof BedRoom){
                bed++;
            }    
        }
        System.out.println("Meeting count: " + meeting);
        System.out.println("Bed count: " + bed);
        
        
    }
    
}
