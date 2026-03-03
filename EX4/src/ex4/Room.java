
package ex4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Room implements IRoom{
    private String id;
    private String name;
    private double baseCost;
    private Date checkinDate;
    private Date checkoutDate;
    Scanner s = new Scanner(System.in);

    public Room(String id, String name, double baseCost, Date checkinDate, Date checkoutDate) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }

    public Room() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public Date getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }
    @Override
    public void  addRoom( ){
        System.out.print("Enter id: ");
        id = s.nextLine();
        System.out.print("Enter name: ");
        name = s.nextLine();
        System.out.print("Enter base cost: ");
        baseCost = s.nextDouble();
        s.nextLine();
        try{
            System.out.print("Enter check in date(dd/MM/yyyy): ");
            checkinDate = new SimpleDateFormat("dd/MM/yyyy").parse(s.nextLine());
            System.out.print("Enter check out date(dd/MM/yyyy): ");
            checkoutDate = new SimpleDateFormat("dd/MM/yyyy").parse(s.nextLine());
        }catch(ParseException e){
            System.out.println("Error");
        }
    }
    @Override
    public void updateRoom( ){
        System.out.print("Enter name: ");
        name = s.nextLine();
        System.out.print("Enter base cost: ");
        baseCost = s.nextDouble();
        s.nextLine();
        try{
            System.out.print("Enter check in date(dd/MM/yyyy): ");
            checkinDate = new SimpleDateFormat("dd/MM/yyyy").parse(s.nextLine());
            System.out.print("Enter check out date(dd/MM/yyyy): ");
            checkoutDate = new SimpleDateFormat("dd/MM/yyyy").parse(s.nextLine());
        }catch(ParseException e){
            System.out.println("Error");
        }
        
    }
    @Override
    public void  displayDetails ( ){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base cost: " + baseCost);
        System.out.println("Check in date: " + new SimpleDateFormat("dd/MM/yyyy").format(checkinDate));
        System.out.println("Check out date: " + new SimpleDateFormat("dd/MM/yyyy").format(checkoutDate));
        
        
    }
    public int calculateDaysOfStay (){
        int diff = (int) (checkoutDate.getTime() - checkinDate.getTime());
        return diff / (1000 * 60 * 60 * 24);
    }
    @Override
    public abstract double calculateCost ( );
    
}
