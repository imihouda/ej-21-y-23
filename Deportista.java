package Tema9;

import java.util.Scanner;
// Ejercicio 21

public class Deportista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del deportista: ");
        String nombre = scanner.next();

        System.out.print("Introduce la edad del deportista: ");
        int edad = scanner.nextInt();

        System.out.print("Introduce la estatura del deportista en metros: ");
        double estatura = scanner.nextDouble();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura + " metros");

        scanner.close();
    }
}
