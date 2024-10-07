package co.edu.uniquindio.poo;

public class AnimalDomestico extends Animal {
    public Comportamiento comportamiento ;
    public Acciones acciones; 
    public AnimalDomestico(String nombre, int edad, float peso, Comportamiento comportamiento, Acciones acciones){
        super(nombre, edad, peso);
        this.comportamiento=comportamiento;
        this.acciones=acciones;
    }
    public Comportamiento getComportamiento() {
        return comportamiento;
    }
    public void setComportamiento(Comportamiento comportamiento) {
        this.comportamiento = comportamiento;
    }
    public Acciones getAcciones() {
        return acciones;
    }
    public void setAcciones(Acciones acciones) {
        this.acciones = acciones;
    }
}
