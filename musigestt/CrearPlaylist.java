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