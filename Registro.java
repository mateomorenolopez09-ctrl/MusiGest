
package musigest;
import java.util.Scanner;

public class Registro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correo, contraseña, fechaNacimiento;

        System.out.print("Ingresa tu correo: ");
        correo = sc.nextLine();

        System.out.print("Ingresa tu contraseña: ");
        contraseña = sc.nextLine();

        System.out.print("Ingresa tu fecha de nacimiento (AAAA-MM-DD): ");
        fechaNacimiento = sc.nextLine();

        System.out.println(" Registro perfecto");
        System.out.println("Correo: " + correo);
        System.out.println("Contraseña: " + contraseña);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);

        
    }
}


