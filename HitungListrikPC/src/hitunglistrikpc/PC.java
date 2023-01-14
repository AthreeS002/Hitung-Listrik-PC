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
public class PC {
    Scanner input = new Scanner(System.in);
    //int monitor, prosesor, gpu, mobo, ram, storage;
    public int hitungPC(int monitor, int prosesor, int gpu, int mobo, int ram, int storage){
//        System.out.print("Monitor: ");
//        monitor = input.nextInt();
//        
//        System.out.print("Prosesor: ");
//        prosesor = input.nextInt();
//        
//        System.out.print("GPU: ");
//        gpu = input.nextInt();
//        
//        System.out.print("Motherboard: ");
//        mobo = input.nextInt();
//        
//        System.out.print("RAM: ");
//        ram = input.nextInt();
//        
//        System.out.print("Storage: ");
//        storage = input.nextInt();
        
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
