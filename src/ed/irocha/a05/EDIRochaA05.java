/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.irocha.a05;

import java.util.Scanner;

/**
 *
 * @author casa
 */
public class EDIRochaA05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner esc= new Scanner(System.in);
        System.out.print("cual va a ser el tamaño del arreglo");
        int b = esc.nextInt();
        int a[] = new int [b];//despues de haber declarado la variable b y preguntarle al usuario de que tamaño es el arreglo la pongo en el areglo para  que el arrehlo tenga ese tamaño
        for(int i=0; i<a.length;i++){
            System.out.print("numero en el arreglo");
            a[i]= esc.nextInt();// en este ciclo se va a ir guardando el dato en el espacio de el arreglo
            
        }
        // TODO code application logic here
    }
    
}
