package ex4;

import java.util.Scanner;

public class EX4 {

    public static void main(String[] args) {
        RoomList list = new RoomList();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add a new Meeting Room");
            System.out.println("2. Add a new Bedroom");
            System.out.println("3. Update a room by ID");
            System.out.println("4. Delete a room by ID");
            System.out.println("5. Find a room by ID");
            System.out.println("6. Display all rooms");
            System.out.println("7. Find the most expensive room");
            System.out.println("8. Count the total number of rooms");
            System.out.println("9. Exit");
            System.out.println("Choice: ");
            int choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 1:
                    MeetingRoom mr = new MeetingRoom();
                    mr.addRoom();
                    list.addRoom(mr);
                    break;
                case 2:
                    BedRoom br = new BedRoom();
                    br.addRoom();
                    list.addRoom(br);
                    break;
                case 3:
                    System.out.print("Enter id: ");
                    String id = s.nextLine();
                    list.updateRoomById(id);
                    break;
                case 4:
                    System.out.print("Enter id: ");
                    String id2 = s.nextLine();
                    list.deleteRoomById(id2);
                    break;
                case 5:
                    System.out.print("Enter id: ");
                    String id3 = s.nextLine();
                    list.findRoomById(id3);
                    break;
                case 6:
                    list.displayAllRooms();
                    break;
                case 7:
                    Room r = list.findMostExpensiveRoom();
                    if(r != null){
                        r.displayDetails();
                    }
                    else{
                        System.out.println("Error");
                    }
                    break;
                case 8:
                    list.countRooms();
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Please enter a number from the list");
                    
            }
        }
    }

}
