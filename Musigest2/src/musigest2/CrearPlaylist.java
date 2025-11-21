<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musigest2;

import java.util.ArrayList;
import java.util.Scanner;

public class CrearPlaylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuarioActual = Login;


        System.out.print("¿Desea crear una nueva playlist? (si/no): ");
        String crear = sc.nextLine();

        if (crear.equalsIgnoreCase("si")) {

            // ✔ Nombre de la playlist (solo esto lo pide)
            System.out.print("Nombre de la playlist: ");
            String nombrePlaylist = sc.nextLine();

            // ✔ Fecha
            System.out.print("Fecha de creación: ");
            String fecha = sc.nextLine();

            // Crear playlist usando el usuario del login
            Playlist playlist = new Playlist(usuarioActual, fecha, nombrePlaylist);

            // Mostrar canciones disponibles
            System.out.println("\n--- Canciones disponibles ---");
            for (Cancion c : biblioteca) {
                System.out.println("- " + c.getNombre());
            }

            // Cantidad de canciones
            System.out.print("\n¿Cuántas canciones desea agregar?: ");
            int cant = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            for (int i = 0; i < cant; i++) {
                System.out.print("Escriba el nombre EXACTO de la canción #" + (i + 1) + ": ");
                String nombreBuscado = sc.nextLine();

                boolean encontrada = false;

                for (Cancion c : biblioteca) {
                    if (c.getNombre().equalsIgnoreCase(nombreBuscado)) {
                        playlist.agregarCancion(c);
                        encontrada = true;
                        break;
                    }
                }

                if (!encontrada) {
                    System.out.println("Canción no encontrada. Intente de nuevo.");
                    i--; // repetir intento
                }
            }

            // Mostrar playlist final
            System.out.println("\n--- Playlist creada ---");
            playlist.mostrarInformacion();
        }
    }
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musigest2;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class CrearPlaylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            System.out.print("¿Desea crear una nueva playlist? (si/no): ");
        String crear = sc.nextLine();

        if (crear.equalsIgnoreCase("si")) {

            System.out.println("Nombre de la playlist:");
            String nombrePlaylist = sc.nextLine();

            System.out.println("Fecha de creación:");
            String fecha = sc.nextLine();

            Playlist playlist = new Playlist("Valentina", fecha, nombrePlaylist);

            // Mostrar las canciones disponibles
            System.out.println("\nCanciones disponibles:");
            for (int i = 0; i < biblioteca.size(); i++) {
                System.out.println((i+1) + ". " + biblioteca.get(i));
            }

            System.out.print("\n¿Cuántas canciones desea agregar?: ");
            int cant = sc.nextInt();

            for (int i = 0; i < cant; i++) {
                System.out.print("Seleccione el número de la canción #" + (i+1) + ": ");
                int op = sc.nextInt();

                // Validar número
                if (op >= 1 && op <= biblioteca.size()) {
                    playlist.agregarCancion(biblioteca.get(op - 1));
                } else {
                    System.out.println("Número inválido, no se agregará.");
                }
            }

            // Mostrar playlist final
            System.out.println("\n--- Playlist creada ---");
            playlist.mostrarInformacion();
        }
    }
}
>>>>>>> b4d0ff8694cffffa9daa418247ad97154e7c95d1
