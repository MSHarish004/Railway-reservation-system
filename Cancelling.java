/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package zoho.railway;

/**
 *
 * @author Saiharish M
 */
public class Cancelling extends Booking {
    public static void cancel(int seatNo,char prefernce,String seatType){
        Passenger remove=null;
        String name="";
        if(seatType.equals("Waiting")){
            for(Passenger p:waitingQueue){
                if(p.getSeatNo()==seatNo){
                    name=p.getName();
                    remove=p;
                    break;
                }
            }
            waitingQueue.remove(remove);
        }
        else if(seatType.equals("RAC")){
            for(Passenger p:RACQueue){
                if(p.getSeatNo()==seatNo){
                    name=p.getName();
                    remove=p;
                    break;
                }
            }
            RACQueue.remove(remove);
            if(!waitingQueue.isEmpty())addRAC(waitingQueue.poll());
        }
        else if(seatType.equals("Birth")){
            for(Passenger p:confirmList){
                if(p.getSeatNo()==seatNo){
                    name=p.getName();
                    remove=p;
                    break;
                }
            }
            upperList.remove(remove);
            middleList.remove(remove);
            lowerList.remove(remove);
            confirmList.remove(remove);
            if(!RACQueue.isEmpty())checkAvailablePref(RACQueue.poll());
            if(!waitingQueue.isEmpty())addRAC(waitingQueue.poll());
        }
        System.out.println("Dear "+name+" your ticket has been cancelled");
    }
    
}
