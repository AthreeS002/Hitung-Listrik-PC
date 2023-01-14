/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hitunglistrikpc;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class MainClass {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        PC pc = new PC();
        Listrik hitungListrik = new Listrik();
        
        
        
        //pc.hitungPC(monitor, prosesor, gpu, mobo, ram, storage);
        
        hitungListrik.tampilHasil();
    }
    
}
