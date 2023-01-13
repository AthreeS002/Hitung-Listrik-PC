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
public class PC extends KomponenPC{
    Scanner input = new Scanner(System.in);
    public int hitungPC(){
        System.out.print("Monitor: ");
        this.monitor = input.nextInt();
        
        System.out.print("Prosesor: ");
        this.prosesor = input.nextInt();
        
        System.out.print("GPU: ");
        this.gpu = input.nextInt();
        
        System.out.print("Motherboard: ");
        this.mobo = input.nextInt();
        
        System.out.print("RAM: ");
        this.ram = input.nextInt();
        
        System.out.print("Storage: ");
        this.storage = input.nextInt();
        
//        System.out.println("\nMonitor: " +monitor + " watt");
//        System.out.println("Prosesor: " +prosesor + " watt");
//        System.out.println("GPU: " +gpu + " watt");
//        System.out.println("Motherboard: " +mobo + " watt");
//        System.out.println("RAM: " +ram + " watt");
//        System.out.println("Storage: " +storage + " watt");
        
        int total = monitor + prosesor + gpu + mobo + ram + storage;
        return total;
        //System.out.println("Total: " + total);
    }
    
}
