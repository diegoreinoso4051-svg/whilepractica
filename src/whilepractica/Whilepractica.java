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
        cajero_automatico();
    }
    
    public static void cajero_automatico(){
        Scanner sc = new Scanner(System.in);
        //algoritmo para simular cajero automatico
        int clave = 1234;
        int intentos = 3;
        while (intentos > 0 && intentos <=3){
        System.out.println("cajero automatico");
        System.out.println("-----------------");
        System.out.println("ingrese su tarjeta: ");
        System.out.println("tarjeta detectada");
        System.out.println("ingresa tu clave");
        int clave_ingresada = sc.nextInt();
        int opcion;
        int intentos2 = 3;
        if (clave_ingresada == clave) {
            do {
            //si la clave coincide
            System.out.println("bienvenido al cajero");
            System.out.println("selecciona una opción: ");
            System.out.println("1. consultar saldo");
            System.out.println("2. retirar dinero");
            System.out.println("3. depositar dinero");
            System.out.println("4. salir");
            System.out.println("ingrese la opcion deseada: ");
            
            opcion = sc.nextInt();
            
            switch  (opcion) {
                case 1://opcion consultar
                    System.out.println("consultar saldo: ");
                    consultar_saldo();
                case 2://opcion retirar
                    System.out.println("retirar saldo: ");
                case 3://opcion depositar
                    System.out.println("depositar dinero");
                case 4://opcion salir
                    System.out.println("Gracias por preferirnos");
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    intentos2 --;
            }
                
            } while (opcion != 4 && intentos >0);
            
            break;
            
        }else{
            System.out.println("clave incorrecta ");
            intentos --;
            System.out.println("te quedan "+ intentos);
        }
    }
        if (intentos == 0){
            System.out.println("tarjeta bloqueada, haz superado los 3 intentos");
        }
    }
    
    public static void consultar_saldo(){
        double saldo = 500;
        System.out.println("el saldo disponible es de: "+saldo);
    }
    
}
