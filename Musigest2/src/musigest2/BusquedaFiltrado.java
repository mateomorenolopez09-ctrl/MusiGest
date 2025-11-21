/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musigest2;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class BusquedaFiltrado {
       
    public static ArrayList<Cancion> buscarCanciones(
        ArrayList<Cancion> biblioteca,
        String filtro,
        String tipoBusqueda) {

        ArrayList<Cancion> resultados = new ArrayList<>();

    for (Cancion c : biblioteca) {
        
        switch (tipoBusqueda.toLowerCase()) {

            case "cancion" -> {
                if (c.getNombre().equalsIgnoreCase(filtro)) {
                    resultados.add(c);
                }
                }

            case "artista" -> {
                if (c.getArtista().equalsIgnoreCase(filtro)) {
                    resultados.add(c);
                }
                }

            case "disco" -> {
                if (c.getDisco().equalsIgnoreCase(filtro)) {
                    resultados.add(c);
                }
                }

            case "cd" -> {
                if (c.getCd().equalsIgnoreCase(filtro)) {
                    resultados.add(c);
                }
                }
        }
    }

        return resultados;
    }
}
