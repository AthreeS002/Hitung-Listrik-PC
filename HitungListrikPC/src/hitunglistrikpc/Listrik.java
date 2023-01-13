/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitunglistrikpc;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Listrik extends PC{
    
    int monitor = this.monitor;
    
    int biayaKwh = 1500;
    Scanner input = new Scanner(System.in);
    public int hitungListrik(){
        System.out.print("Total Penggunaan dalam satu hari: ");
        int penggunaan = input.nextInt();
        
        int totalSebulan = (hitungPC() * penggunaan) * 30;
        int hitungListrikSebulan = (totalSebulan/1000) * this.biayaKwh;
        return hitungListrikSebulan;
    }
    
    public void tampilHasil(){
        //System.out.println("hai");
        System.out.println("Monitor: "+this.monitor +" watt");
    }
}
