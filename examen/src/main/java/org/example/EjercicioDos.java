package org.example;

import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner entradaTeclado=new Scanner(System.in);
        System.out.println("*******Bienvenido a tu empresa el futuroS.A.S*******");

        int opciones=0;
        int horasLaboradas=0;
        int precioPorHora=0;
        String nombreEmpleado=null;
        do {
            System.out.println("este es tu menu");
            System.out.println("1. ingresar numero de horas trabajadas en la semana: ");
            System.out.println("2. tarifa por hora: ");
            System.out.println("3. ver salario: ");
            System.out.println("4. pagar nomina: ");
            System.out.println("5. salir");
            System.out.println("Digita una opcion");
            opciones= entradaTeclado.nextInt();
            double deduccion=(0.08);
            double salarioConDeduccion=(horasLaboradas*precioPorHora)*deduccion;
            double totalConDeduccion=(horasLaboradas*precioPorHora)-salarioConDeduccion;
            switch (opciones){
                case 1:
                    System.out.println("digita las horas trabajadas en esta semana");
                    horasLaboradas= entradaTeclado.nextInt();
                    if (horasLaboradas<0){
                        System.out.println("ingresa una opcion valida");
                    }
                    break;
                case 2:
                    System.out.println("cuanto te pagan por hora: ");
                    precioPorHora= entradaTeclado.nextInt();
                    if (precioPorHora<0){
                        System.out.println("ingrese un valor verdadero");
                    }
                    break;
                case 3:
                    System.out.println("tu salario de esta semana es: "+horasLaboradas*precioPorHora);
                    break;
                case 4:
                    System.out.println("pagar nomina");
                    System.out.println("ingresa tu nombre: ");
                    nombreEmpleado= entradaTeclado.nextLine();
                    entradaTeclado.next();
                    System.out.println("tu salario a pagar es:  "+totalConDeduccion+" porque te hicimos una deduccion del 8% "+ "quieres mas plata?");
                    break;
                case 5:
                    System.out.println("hasta luego");
                    break;
                default:
                    System.out.println("ingrese opcion valida");

            }
        }while (opciones!=4);
        System.out.println("Vuelve pronto");


    }
}
