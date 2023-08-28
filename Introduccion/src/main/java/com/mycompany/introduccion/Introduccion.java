/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.introduccion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Uziel
 */
public class Introduccion {

    public static void main(String[] args) {
        //Scanner entrada= new Scanner (System.in);
       /* double numero;
        System.out.print("Digite un numero: ");
        numero=entrada.nextDouble();
        
        System.out.println("El numero es: "+ numero);*/
      /* String cadena;
       System.out.print("Digite una cadena: ");
       cadena=entrada.nextLine();
       System.out.println("La cadena es: "+cadena);*/
      /*char letra;
      System.out.print("Digite una letra: ");
      letra=entrada.next().charAt(0);
      System.out.println("La letra es: "+letra);*/
      String cadena;
      int entero;
      char letra;
      double decimal;
      cadena=JOptionPane.showInputDialog("Digite una cadena: ");  
      entero=Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
      letra=JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
      decimal=Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
    
      JOptionPane.showMessageDialog(null,"La cadena es:"+cadena);
      JOptionPane.showMessageDialog(null,"El entero es:"+entero);
      JOptionPane.showMessageDialog(null,"El caracter es:"+letra);
      JOptionPane.showMessageDialog(null,"El decimal es:"+decimal);


      
    }
}
