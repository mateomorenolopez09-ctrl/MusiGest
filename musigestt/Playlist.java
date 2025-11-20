/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musigest2;
import java.util.ArrayList;

public class Playlist extends Persona {
    private String fechaCreacion;
    private String nombrePlaylist;
    private ArrayList<Cancion> canciones;
    
    public Playlist(String nombre, String fechaCreacion, String nombrePlaylist) {
        super(nombre);
        this.fechaCreacion = fechaCreacion;
        this.nombrePlaylist = nombrePlaylist;
        this.canciones = new ArrayList<>();
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void agregarCancion(Cancion c) {
        canciones.add(c);
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre Playlist: " + nombrePlaylist);
        System.out.println("Fecha: " + fechaCreacion);
        System.out.println("Creador: " + getNombre());
        System.out.println("Canciones:");
        for (Cancion c : canciones) {
            System.out.println("- " + c);
        }
    }
}
