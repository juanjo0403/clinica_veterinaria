package co.edu.uniquindio.poo;

public class Canario extends AnimalDomestico {
    private String colorplumas;
    public Canario(String nombre, int edad, float peso, Comportamiento comportamiento, Acciones acciones, String colorplumas){
       super(nombre, edad, peso, comportamiento, acciones);
       this.colorplumas=colorplumas;
    }
    public String getColorplumas() {
        return colorplumas;
    }
    public void setColorplumas(String colorplumas) {
        this.colorplumas = colorplumas;
    }
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    @Override
    public String toString(){
        return "El canario se llama: " + nombre + ", tiene una edad de " + edad + " años, pesa " + peso + " kilogramos, tiene un comportamiento " + comportamiento + ", realiza acciones como " + acciones + "y sus plumas son de color " + colorplumas;
    }
}
