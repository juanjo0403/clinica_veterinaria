package co.edu.uniquindio.poo;

public class AnimalSalvaje extends Animal {
    public Comportamiento comportamiento ;
    public Acciones acciones;
    private String habitat;
    public AnimalSalvaje(String nombre, int edad, float peso, Comportamiento comportamiento, Acciones acciones, String habitat){
        super(nombre, edad, peso);
        this.comportamiento=comportamiento;
        this.acciones=acciones;
        this.habitat=habitat;
    }
    public Acciones getAcciones() {
        return acciones;
    }
    public void setAcciones(Acciones acciones) {
        this.acciones = acciones;
    }
    public Comportamiento getComportamiento() {
        return comportamiento;
    }
    public void setComportamiento(Comportamiento comportamiento) {
        this.comportamiento = comportamiento;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
