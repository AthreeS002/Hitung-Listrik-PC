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
    
    double biayaKwh = 1500.0;
    Scanner input = new Scanner(System.in);
    public double hitungListrik(){
        
        System.out.print("Monitor: ");
        int monitor = input.nextInt();
        
        System.out.print("Prosesor: ");
        int prosesor = input.nextInt();
        
        System.out.print("GPU: ");
        int gpu = input.nextInt();
        
        System.out.print("Motherboard: ");
        int mobo = input.nextInt();
        
        System.out.print("RAM: ");
        int ram = input.nextInt();
        
        System.out.print("Storage: ");
        int storage = input.nextInt();
        
        System.out.print("Total Penggunaan (jam) dalam satu hari: ");
        int penggunaan = input.nextInt();
        
        int totalSebulan = (hitungPC(monitor, prosesor, gpu, mobo, ram, storage) * penggunaan) * 30;
        double hitungListrikSebulan = (totalSebulan/1000) * this.biayaKwh;
        return hitungListrikSebulan;
    }
    
    public void tampilHasil(){
        //System.out.println("hai");
        System.out.println(hitungListrik());
        System.out.println("Monitor: "+this.monitor +" watt");
    }
}
