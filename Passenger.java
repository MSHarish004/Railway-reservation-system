/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package zoho.railway;

/**
 *
 * @author Saiharish M
 */
public class Passenger {
    private int seatNo;
    private String name;
    private int age;
    private char preference;
    private int passengerId;
    private String seatType;
    /**
     * @param args the command line arguments
     */
    public  void setName(String name) {
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public  void setAge(int age) {
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public  void setPreference(char preference) {
        this.preference=preference;
    }
    public char getPreference(){
        return preference;
    }
    public  void setPassengerId(int passengerId) {
        this.passengerId=passengerId;
    }
    public int getPassengerId(){
        return passengerId;
    }
    public  void setSeatNo(int seatNo) {
        this.seatNo=seatNo;
    }
    public int getSeatNo(){
        return seatNo;
    }
    public  void setSeatType(String seatType) {
        this.seatType=seatType;
    }
    public String getSeatType(){
        return seatType;
    }
  
    @Override
    public  String toString(){
        return "Passenger Name: "+name+"\nAge: "+age+"\nPreference: "+preference+"\nSeatNo: "+seatNo+"\nSeatType: "+seatType;
    }
}
