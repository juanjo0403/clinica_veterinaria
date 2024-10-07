package co.edu.uniquindio.poo;
import java.util.LinkedList;
public class Dueño {
    private String nombre; 
    private String direccion; 
    private String telefono;
    private LinkedList<Perro>perros;
    private LinkedList<Gato>gatos;
    public Dueño(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.perros = new LinkedList<>();
        this.gatos= new LinkedList<>();
        assert !nombre.isBlank();
        assert !direccion.isBlank();
        assert !telefono.isBlank();
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
    public LinkedList<Perro> getPerros() {
        return perros;
    }
    public void setPerros(LinkedList<Perro> perros) {
        this.perros = perros;
    }
    public LinkedList<Gato> getGatos() {
        return gatos;
    }
    public void setGatos(LinkedList<Gato> gatos) {
        this.gatos = gatos;
    }
    public void agregarPerro(Perro perro){
        perros.add(perro);
    }
    public void agregarGato(Gato gato){
        gatos.add(gato);
    }
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    @Override
    public String toString() {
        return "\n Dueño: " + nombre + "\n Dirección: " + direccion + "\n Teléfono: " + telefono + "\n tiene como mascota " + perros + gatos;
    }
}
