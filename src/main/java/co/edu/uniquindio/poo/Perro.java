package co.edu.uniquindio.poo;

public class Perro extends AnimalDomestico {
    private String raza;
    public Perro(String nombre, int edad, float peso, Comportamiento comportamiento, Acciones acciones,String raza){
        super(nombre, edad,peso,comportamiento,acciones);
        this.raza=raza;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    @Override
    public String toString(){
        return "El perro se llama: " + nombre + ", tiene una edad de" + edad + " años, pesa" + peso + " kilogramos, tiene un comportamiento " + comportamiento + ", realiza acciones como " + acciones + "y es de raza " + raza;
    }
}
