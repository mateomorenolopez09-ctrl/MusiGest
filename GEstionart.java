package musigest;
import java.util.ArrayList;
import java.util.Scanner;

class Artista {
    String nombre;
    String apellido;
    String fechaNacimiento;

    Artista(String nombre, String apellido, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " - Nacido: " + fechaNacimiento;
    }
}

public class GEstionart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Artista> artistas = new ArrayList<>();

        System.out.println("Ingrese 1 para Crear | 2 para Editar | 3 para Eliminar:");
        int opcion = scanner.nextInt();
        scanner.nextLine(); 

        if (opcion == 1) {
            System.out.print("Ingrese la cantidad de artistas que quiere crear: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            for (int i = 1; i <= cantidad; i++) {
                System.out.print("Nombre del artista " + i + ": ");
                String nombre = scanner.nextLine();

                System.out.print("Apellido del artista " + i  + ": ");
                String apellido = scanner.nextLine();

                System.out.print("Fecha de nacimiento (AAAA-MM-DD): ");
                String fechaNacimiento = scanner.nextLine();

                artistas.add(new Artista(nombre, apellido, fechaNacimiento));
            }

            System.out.println("Artistas creados:");
            for (Artista a : artistas) {
                System.out.println(a);
            }
        }

        else if (opcion == 2) {
            if (artistas.isEmpty()) {
                System.out.println("No hay artistas para editar.");
            } else {
               
                for (int i = 1; i < artistas.size(); i++) {
                    System.out.println((i + 1) + ". " + artistas.get(i));
                }

                System.out.print("¿Cuál artista quieres editar?: ");
                int num = scanner.nextInt() - 1;
                scanner.nextLine();

                Artista art = artistas.get(num);

                System.out.println("¿Qué quieres editar?");
                System.out.println("1. Nombre");
                System.out.println("2. Apellido");
                System.out.println("3. Fecha de nacimiento");
                int campo = scanner.nextInt();
                scanner.nextLine();

                switch (campo) {
                    case 1:
                        System.out.print("Nuevo nombre: ");
                        art.nombre = scanner.nextLine();
                        break;
                    case 2:
                        System.out.print("Nuevo apellido: ");
                        art.apellido = scanner.nextLine();
                        break;
                    case 3:
                        System.out.print("Nueva fecha (AAAA-MM-DD): ");
                        art.fechaNacimiento = scanner.nextLine();
                        break;
                }

                System.out.println("Artista actualizado:");
                System.out.println(art);
            }
        }

        else if (opcion == 3) {

    if (artistas.isEmpty()) {
        System.out.println("No hay artistas para eliminar.");
    } else {

        
        System.out.println("Lista de artistas:");
        for (int i = 0; i < artistas.size(); i++) {
            System.out.println((i + 1) + ". " + artistas.get(i));
        }

         
        System.out.print("¿Qué artista quieres eliminar? Ingresa el número: ");
        int numEliminar = scanner.nextInt() - 1;
        scanner.nextLine(); 

        
        if (numEliminar < 0 || numEliminar >= artistas.size()) {
            System.out.println("Número inválido.");
        } else {
            Artista eliminado = artistas.remove(numEliminar);
            System.out.println("Artista eliminado: " + eliminado);
        }
        }
        }
    }
}

