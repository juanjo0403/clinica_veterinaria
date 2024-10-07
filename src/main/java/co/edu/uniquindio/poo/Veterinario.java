package co.edu.uniquindio.poo;

public class Veterinario extends Persona {
    private String horario;
    public Veterinario(String nombre, String apellido, String cedula, String telefono, String horario){
        super(nombre, apellido, cedula, telefono);
        this.horario= horario;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    @Override
    public String toString(){
        return "Veterinario: " + nombre + ", horario=" + horario + ", apellido=" + apellido + ", cedula=" + cedula + ", telefono=" +telefono;
    }
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
