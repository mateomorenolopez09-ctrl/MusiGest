<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musigest2;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre;
    private String correo;
    private String contraseña;
    private String tipo;
    
    //constructor
    public Persona(String nombre, String correo, String contraseña, String tipo) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }
    
    //solo nombre
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public String getContraseña() {
        return contraseña;
    }
    public String getTipo() {
        return tipo;
    }
    
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void saludar() {
        System.out.println("Nombre: " + getNombre());
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Tipo de Usuario: " + getTipo());
    }
}   
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musigest2;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre;
    private String correo;
    private String contraseña;
    private String tipo;
    
    //constructor
    public Persona(String nombre, String correo, String contraseña, String tipo) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }
    
    //solo nombre
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public String getContraseña() {
        return contraseña;
    }
    public String getTipo() {
        return tipo;
    }
    
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void saludar() {
        System.out.println("Nombre: " + getNombre());
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Tipo de Usuario: " + getTipo());
    }
}   
>>>>>>> b4d0ff8694cffffa9daa418247ad97154e7c95d1
