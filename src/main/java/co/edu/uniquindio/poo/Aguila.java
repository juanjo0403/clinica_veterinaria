package co.edu.uniquindio.poo;

public class Aguila extends AnimalSalvaje {
    private String tamañoAlas;
    public Aguila(String nombre, int edad, float peso, Comportamiento comportamiento, Acciones acciones, String habitat, String tamañoAlas){
        super(nombre, edad, peso, comportamiento, acciones, habitat);
        this.tamañoAlas=tamañoAlas;
    }
    public String getTamañoAlas() {
        return tamañoAlas;
    }
    public void setTamañoAlas(String tamañoAlas) {
        this.tamañoAlas = tamañoAlas;
    }
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    @Override
    public String toString(){
        return "El Aguila se llama " + nombre + ", tiene " + edad + " años de edad, cuenta con un peso de " + peso + ", tiene un comportamiento " + comportamiento + " realiza acciones como " + acciones + " y " + acciones + ", sus alas son " + tamañoAlas;
    }
}
