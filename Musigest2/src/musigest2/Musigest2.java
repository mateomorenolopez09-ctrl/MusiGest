<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musigest2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Musigest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n--- Buscar Canciones ---");
        System.out.println("1. Buscar por nombre");
        System.out.println("2. Buscar por artista");
        System.out.println("3. Buscar por disco");
        System.out.println("4. Buscar por CD");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        String tipoBusqueda = "";
        switch (opcion) {
            case 1 -> tipoBusqueda = "cancion";
            case 2 -> tipoBusqueda = "artista";
            case 3 -> tipoBusqueda = "disco";
            case 4 -> tipoBusqueda = "cd";
        }

        System.out.print("Ingrese el texto a buscar: ");
        String filtro = sc.nextLine();

        // Ejecutar búsqueda
        ArrayList<Cancion> resultados = 
        buscarCanciones(biblioteca, filtro, tipoBusqueda);

// Mostrar resultados
        if (resultados.isEmpty()) {
            System.out.println("No se encontraron canciones.");
        } else {
            System.out.println("\nResultados:");
        for (Cancion c : resultados) {
            System.out.println("- " + c.getNombre() + " (" + c.getArtista() + ")");
    }
}

    }
    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musigest2;

/**
 *
 * @author Usuario
 */
public class Musigest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
>>>>>>> b4d0ff8694cffffa9daa418247ad97154e7c95d1
