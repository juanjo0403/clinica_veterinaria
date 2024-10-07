package co.edu.uniquindio.poo;

public class Leon extends AnimalSalvaje {
    private String tamañoDeMelena;
    private String habilidadParaCazar;
    public Leon(String nombre, int edad, float peso, Comportamiento comportamiento, Acciones acciones, String habitat, String tamañoDeMelena, String habilidadParaCazar){
       super(nombre, edad, peso, comportamiento, acciones,habitat);
       this.tamañoDeMelena=tamañoDeMelena;
       this.habilidadParaCazar=habilidadParaCazar;
    }
    public String getTamañoDeMelena() {
        return tamañoDeMelena;
    }
    public void setTamañoDeMelena(String tamañoDeMelena) {
        this.tamañoDeMelena = tamañoDeMelena;
    }
    public String getHabilidadParaCazar() {
        return habilidadParaCazar;
    }
    public void setHabilidadParaCazar(String habilidadParaCazar) {
        this.habilidadParaCazar = habilidadParaCazar;
    }
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    @Override
    public String toString(){
        return "El león se llama " + nombre + ", tiene " + edad + " años de edad, cuenta con un peso de " + peso + ", tiene un comportamiento " + comportamiento + " realiza acciones como " + acciones + " y " + acciones + ", su tamaño de melena es " + tamañoDeMelena + " y tiene una halidad para casar " +habilidadParaCazar;
    }
}
