/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zoho.railway;
import java.util.*;
/**
 *
 * @author Saiharish M
 */
public class Railway {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean loop=true;
        while(loop){
            System.out.println("Choose Any one \n1.Book Ticket \n2.Display Ticket \n3.cancel \n4.exit");
            int n=sc.nextInt();
            sc.nextLine();
            switch(n){
                case 1:System.out.print("enter your name: ");
                       String name=sc.nextLine();
                       System.out.print("\nenter your age: ");
                       int age=sc.nextInt();
                       System.out.print("\nenter your preference: ");
                       char pref=sc.next().charAt(0);
                       Booking.book(new Passenger(),name,age,pref);
                       break;
                case 2:Booking.display();
                       break;
                case 3:System.out.print("\nenter your seatNo: ");
                       int seatNo=sc.nextInt();
                       System.out.print("\nenter your preference: ");
                       char cancelPref=sc.next().charAt(0);
                       sc.nextLine();
                       System.out.print("\nenter your SeatType: ");
                       String seatType=sc.nextLine();
                       System.out.println(seatNo+" "+cancelPref+" "+seatType);
                       Cancelling.cancel(seatNo, cancelPref, seatType);
                       break;
                case 4:loop=false;
                       System.out.println("Exiting.....");
                       break;
            }
        }
    }
}
