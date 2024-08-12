/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package zoho.railway;
import java.util.*;
/**
 *
 * @author Saiharish M
 */
public class Booking {

    /**
     * @param args the command line arguments
     */
    static int lower=1,upper=3,middle=2;
    static int birthLimit=3;
    static int RACLimit=1;
    static int waitingLimit=2;
    private static int IdProvider=0;
    static ArrayList<Passenger> lowerList=new ArrayList<>();
    static ArrayList<Passenger> middleList=new ArrayList<>();
    static ArrayList<Passenger> upperList=new ArrayList<>();
    static ArrayList<Passenger> confirmList=new ArrayList<>();
    
    static Queue<Passenger> RACQueue=new LinkedList<>();
    static Queue<Passenger> waitingQueue=new LinkedList<>();
    public static void book(Passenger p,String name,int age, char pref) {
        //Booking logic
        p.setName(name);
        p.setAge(age);
        p.setPreference(pref);
        if(confirmList.size()==birthLimit){
            if(addRAC(p)){
                System.out.println("Dear "+p.getName()+" your RAC ticket is boooked with ID "+RACQueue.size());
            }
            else if(addWaiting(p)){
                System.out.println("Dear "+p.getName()+" your Waiting List ticket is boooked with ID "+waitingQueue.size());               
            }
            else{
                System.out.println("Dear "+p.getName()+" tickets are not available currently");
            }
        }
        else if(checkAvailablePref(p)){
            System.out.println("Dear "+p.getName()+" your ticket is confirmed with seat "+p.getSeatNo()+" "+p.getPreference()+" birth");
        }
        else{
            System.out.println("Dear "+p.getName()+" there is no berth in your prefernece please change the prefernece");
        }
        
    }
    public static boolean addRAC(Passenger p){
        if(RACQueue.size()<RACLimit){
            p.setSeatType("RAC");
            RACQueue.add(p);
            return true;
        }
        return false;
    }
    public static boolean addWaiting(Passenger p){
        if(waitingQueue.size()<waitingLimit){
            p.setSeatType("Waiting");
            waitingQueue.add(p);
            return true;
        }
        return false;
    }
    public static boolean checkAvailablePref(Passenger p){
        char pref=p.getPreference();
        if(pref=='L'){
            if(lowerList.size()<(birthLimit/3)){
                p.setSeatType("Birth");
                p.setSeatNo(lower);
                lower=lower+3;
                p.setPassengerId(++IdProvider);
                lowerList.add(p);
            }
            else{
                return false;
            }
        }
        if(pref=='M'){
            if(middleList.size()<(birthLimit/3)){
                p.setSeatType("Birth");
                p.setSeatNo(middle);
                middle=middle+3;
                p.setPassengerId(++IdProvider);
                middleList.add(p);
            }
            else{
                return false;
            }
        }
        if(pref=='U'){
            if(upperList.size()<(birthLimit/3)){
                p.setSeatType("Birth");
                p.setSeatNo(upper);
                upper=upper+3;
                p.setPassengerId(++IdProvider);
                upperList.add(p);
            }
            else{
                return false;
            }
        }
        confirmList.add(p);
        return true;
    }
    public static void display(){
        System.out.println("-------------------");
        for(Passenger p:confirmList){
            System.out.println(p.toString());
            System.out.println("-------------------");
        }
    }
}
