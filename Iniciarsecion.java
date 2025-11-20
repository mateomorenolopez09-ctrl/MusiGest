
package musigest;
 import java.util.Scanner;

public class Iniciarsecion {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mateo
       String correoCorrecto="mateomorenolopez09@gmail.com";
        String contraseñaCorrecto = "12345";
         // Valentina
       String usuarioCorrecto="valentinalpiri2323@gmail.com";
        String contraCorrecto = "6789";
         // Laura
       String correo="laurasofi.cabrejobello@gmail.com";
        String contraseñal = "101112";

        // Se le píde al usuario
        System.out.print("Ingrese su correo electronico: ");
        String correos = scanner.nextLine();

        System.out.print("Ingrese su contrasena: ");
        String contraseña = scanner.nextLine();

       // Se verifica si el usuario es correcto mateo,valentina,Laura
        if(correos.equals(usuarioCorrecto) && contraseña.equals(contraCorrecto)) {
            System.out.println("Perfecto Bienvendo Mateo");
        } else if(correos.equals(correoCorrecto) && contraseña.equals(contraseñaCorrecto)) {
            System.out.println("Perfecto Bienvenda Valentina");
        }
         else if(correos.equals(correo) && contraseña.equals(contraseñal)) {
            System.out.println("Perfecto Bienvenda  Laura");
        } 
         else {
            System.out.println("verifique la usuario o la contrasena.");
        }
       

       
    }
}