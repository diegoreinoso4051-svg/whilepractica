/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whilepractica;

import java.util.Scanner;

/**
 *
 * @author diegoreinoso
 */
public class Whilepractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("hola mundo");
        System.out.println("practica con github y ciclo hile");
        int opcion;
        do {
            System.out.println("1.suma");
            System.out.println("2.resta");
            System.out.println("ingrese una opcion");
            
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("funcion suma");
                    break;
                case 2:
                    System.out.println("funcion resta");
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    
            }       
            
        } while (opcion <=3);
    }
    
}
