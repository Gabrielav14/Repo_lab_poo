package org.example;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

//Gabriela
public class Main {
    public static void main(String[] args) {

        clienteService clienteservice= new clienteService();
        Scanner scan = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("---Bienvendio al Banco---");
            System.out.println("Elige una opcion");
            System.out.println("1. Registrar Cliente normal");
            System.out.println("2. Registrar cliente VIP/preferencial");
            System.out.println("3. Atender siguiente cliente");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion: ");

            if (scan.hasNextInt()){
            opcion = scan.nextInt();
            scan.nextLine();

    switch (opcion) {
        case 1:
            System.out.println("Ingrese el nombre del cliente normal: ");
            String nombreNormal = scan.nextLine().trim();
            if (!nombreNormal.isEmpty()) {
               clienteservice.agregarClientesNormal(nombreNormal);
            } else {
                System.out.println("El nombre no puede quedar vacio");
            }
            break;

        case 2:
            System.out.println("Ingrese el nombre del cliente VIP: ");
            String nombreVIP = scan.nextLine().trim();
            if (!nombreVIP.isEmpty()){
                clienteservice.agregarClienteVIP(nombreVIP);
            }else{
                System.out.println("El nombre no puede estar vacio");
            }
            break;

        case 3:
            clienteservice.atenderSiguienteCliente();
            break;

        case 4:
            System.out.println("Saliendo del sistema... :D");
            break;

        default:
            System.out.println("Opcion invalida");
    }
            }else {
                System.out.println("Entrada invaldia. ingresar un numero entero");
            }
        }
        while (opcion != 4);

        scan.close();
        }
    }
