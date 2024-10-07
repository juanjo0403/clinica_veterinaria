package co.edu.uniquindio.poo;
import java.util.LinkedList;
public class Veterinaria {
    private String nombre; 
    private String direccion;
    private String telefono;
    private LinkedList<Veterinario>veterinarios;
    public Veterinaria(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.veterinarios = new LinkedList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public LinkedList<Veterinario> getVeterinarios() {
        return veterinarios;
    }
    public void setVeterinarios(LinkedList<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    } 
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    @Override
    public String toString() {
        return "\n Veterinaria: " + nombre + "\n Dirección: " + direccion + "\n Teléfono: " + telefono + " \n los veterinarios son: " +veterinarios;
    }   
    public void agregarVeterinario(Veterinario veterinario) { 
        veterinarios.add(veterinario);
    }
}
