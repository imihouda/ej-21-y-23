package Tema9;

//Ej 23

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumaNumerosReales {
    public static void main(String[] args) {
        try {
            // Crear un objeto File con el nombre del archivo
            File archivo = new File("numeros_reales.txt");

            // Crear un objeto Scanner para leer el archivo
            Scanner scanner = new Scanner(archivo);

            // Inicializar la variable para la suma
            double suma = 0;

            // Leer el archivo línea por línea
            while (scanner.hasNextLine()) {
                // Leer la siguiente línea del archivo
                String linea = scanner.nextLine();

                // Convertir la línea leída a un número real
                double numero = Double.parseDouble(linea);

                // Sumar el número al acumulador
                suma += numero;
            }

            // Mostrar la suma de los números
            System.out.println("La suma de los números es: " + suma);

            // Cerrar el objeto Scanner
            scanner.close();

        } catch (FileNotFoundException e) {
            // Mostrar un mensaje de error si el archivo no existe
            System.out.println("El archivo no existe.");
            e.printStackTrace();
        }
    }
}

