/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musiguest;

/**
 *
 * @author APRENDIZ
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Canciones {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<String> nombreCancion = new ArrayList<>();
    ArrayList<String> Artista = new ArrayList<>();
    ArrayList<String> fechaCrear = new ArrayList<>();
    ArrayList<String> Duracion = new ArrayList<>();
    ArrayList<ArrayList<String>> ListaCanciones = new ArrayList<>();
    
    System.out.println("REGISTRAR CANCIONES");
    
    boolean continuar = true;
    
   while (continuar) {

            System.out.print("\nIngresa el nombre de la cancion: ");
            String nombrecancion = sc.nextLine();

            System.out.print("Ingresa el artista: ");
            String artista = sc.nextLine();

            System.out.print("Ingresa la fecha de creación (yyyy-MM-dd): ");
            String fechacrear = sc.nextLine();
            
            System.out.print("Ingresa la duracion de la cancion: ");
            String duracion = sc.nextLine();

            // Lista temporal para las canciones de este álbum
            ArrayList<String> cancionesAlbum = new ArrayList<>();

            System.out.println("\n=== Registro de canciones del álbum ===");

                System.out.print("¿Deseas agregar otra canción? (si/no): ");
                String opc = sc.nextLine();

                if (opc.equalsIgnoreCase("no")) {
                    continuar = false;
                }
            }
   System.out.println("\n===== CANCIONES =====\n");

        for (int i = 0; i < nombreCancion.size(); i++) {
            System.out.println((i + 1) + ". " + nombreCancion.get(i));
            System.out.println("   Artista: " + Artista.get(i) + "Fecha de creacion: " + fechaCrear.get(i) + "   Duracion: " + Duracion.get(i));

            ArrayList<String> cTemp = ListaCanciones.get(i);
            for (String c : cTemp) {
                System.out.println("      - " + c);
            }
            System.out.println();
        }

        sc.close();
    }
    
}
