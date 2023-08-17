package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaTeclado=new Scanner(System.in);

        System.out.println("*******TIENDA PELUCHITOS*******");
        int opciones=0;
        String nombrePeluche=null;
        double precioUnitario=0;

        do {
            System.out.println("este es tu menu");
            System.out.println("1. agregar nombre y precio del peluche");
            System.out.println("2. calcular el costo de venta con iva");
            System.out.println("3. infromacion del peluche");
            System.out.println("4. editar precio unitario");
            System.out.println("5. salir");
            System.out.println("ingresa tu opcion");
            opciones= entradaTeclado.nextInt();
            double iva=(precioUnitario*(0.19));
            double costoIva=0.19;
            double precioConIva=precioUnitario*costoIva;
            double precioDeVenta=precioUnitario+precioConIva;
            switch (opciones){
                case 1:
                    System.out.println("agrega el nombre del nuevo peluche");
                    nombrePeluche=entradaTeclado.next();
                    System.out.println("Ingresa el precio unitario de ese peluche");
                    precioUnitario= entradaTeclado.nextInt();
                    break;
                case 2:
                    System.out.println("el costo de venta es : "+precioDeVenta);
                    break;
                case 3:
                    System.out.println("el nombre del peluche es: "+nombrePeluche+" ,el precio unitario es: "+precioUnitario+" y el costo de venta es: "+precioDeVenta);
                    break;
                case 4:
                    System.out.println("cambia el precio unitario del peluche: ");
                    precioUnitario= entradaTeclado.nextInt();
                    break;
                case 5:
                    System.out.println("salir");
                    break;
                default:
                    System.out.println("digite una opcion valida");
            }

        }while (opciones!=5);
        System.out.println("digita opcion valida");


    }
}