package co.edu.uniquindio.poo;

public class Gato extends AnimalDomestico {
    private String colorDelPelaje;
    public Gato(String nombre, int edad, float peso, Comportamiento comportamiento, Acciones acciones, String colorDelPelaje){
        super(nombre, edad,peso,comportamiento,acciones);
        this.colorDelPelaje=colorDelPelaje;   
    }
    public String getColorDelPelaje() {
        return colorDelPelaje;
    }
    public void setColorDelPelaje(String colorDelPelaje) {
        this.colorDelPelaje = colorDelPelaje;
    }
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    @Override
    public String toString(){
        return "El gato se llama: " + nombre + ", tiene una edad de" + edad + " años, pesa " + peso + " kilogramos, tiene un comportamiento " + comportamiento + ", realiza acciones como " + acciones + "y su pelaje es de color " + colorDelPelaje;
    }
}
