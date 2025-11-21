/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musiguest;

/**
 
 * @author APRENDIZ
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Album {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nombresAlbum = new ArrayList<>();
        ArrayList<String> artistas = new ArrayList<>();
        ArrayList<String> fechas = new ArrayList<>();
        ArrayList<ArrayList<String>> listaCanciones = new ArrayList<>();

        System.out.println("=== REGISTRO DE ÁLBUMES MUSIQUEST ===");

        boolean continuar = true;

        while (continuar) {

            System.out.print("\nIngresa el nombre del álbum: ");
            String nombre = sc.nextLine();

            System.out.print("Ingresa el artista: ");
            String artista = sc.nextLine();

            System.out.print("Ingresa la fecha de creación (yyyy-MM-dd): ");
            String fecha = sc.nextLine();

            // Lista temporal para las canciones de este álbum
            ArrayList<String> cancionesAlbum = new ArrayList<>();

            System.out.println("\n=== Registro de canciones del álbum ===");

            boolean agregarCanciones = true;

            while (agregarCanciones) {
                System.out.print("Ingresa el nombre de la canción: ");
                String cancion = sc.nextLine();
                cancionesAlbum.add(cancion);

                System.out.print("¿Deseas agregar otra canción? (si/no): ");
                String opc = sc.nextLine();

                if (opc.equalsIgnoreCase("no")) {
                    agregarCanciones = false;
                }
            }

            // Guardar los datos en las listas principales
            nombresAlbum.add(nombre);
            artistas.add(artista);
            fechas.add(fecha);
            listaCanciones.add(cancionesAlbum);

            System.out.println("\nÁlbum registrado con éxito!");

            System.out.print("\n¿Deseas registrar otro álbum? (s/n): ");
            String opcion = sc.nextLine();

            if (opcion.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        System.out.println("\n===== ÁLBUMES REGISTRADOS =====\n");

        for (int i = 0; i < nombresAlbum.size(); i++) {
            System.out.println((i + 1) + ". " + nombresAlbum.get(i));
            System.out.println("   Artista: " + artistas.get(i));
            System.out.println("   Fecha: " + fechas.get(i));
            System.out.println("   Canciones:");

            ArrayList<String> cTemp = listaCanciones.get(i);
            for (String c : cTemp) {
                System.out.println("      - " + c);
            }
            System.out.println();
        }

        sc.close();
    }
}
