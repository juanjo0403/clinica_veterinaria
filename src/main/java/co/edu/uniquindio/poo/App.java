package co.edu.uniquindio.poo;
public class App {
    public static void main(String[] args) {
        //Creación de la veterinaria
        Veterinaria veterinaria= new Veterinaria("AYH", "CRA 22", "3173534320");
        //Creación veterinarios
        Veterinario veterinario1= new Veterinario("Juan", "Herrera", "1005088752", "3024568301", "8 a 5:30");
        Veterinario veterinario2= new Veterinario("José", "Herrera", "1005088753", "3024568302", "5:30 a 1:00");
        Veterinario veterinario3= new Veterinario("Sofia", "jimenez", "1006099763", "3173468901", "8 a 5:30");
        veterinaria.agregarVeterinario(veterinario1);
        veterinaria.agregarVeterinario(veterinario2);
        veterinaria.agregarVeterinario(veterinario3);
        Veterinaria.mostrarMensaje(veterinaria.toString());
        //Creacion de los dueños
        Dueño dueño1= new Dueño("Carlos", "sur", "314589635");
        Dueño dueño2= new Dueño("Stefania","centro","3204567809");
        //Creacion de perros, gatos, canarios, leones, aguilas
        Perro perro1= new Perro("puky", 7, 8 , Comportamiento.PASIVO, Acciones.CORRER, "beagle");
        Perro perro2= new Perro("Sirius", 8, 15, Comportamiento.PASIVO, Acciones.DORMIR, "Criollo");
        Gato gato1= new Gato("gato", 7, 7, Comportamiento.PASIVO, Acciones.COMER, "naranja");
        Leon leon1= new Leon("mufasa", 10, 100, Comportamiento.AGRESIVO, Acciones.CORRER, "sabana Africana","grande", "buena");
        Canario canario1= new Canario("silvestre", 1, 1, Comportamiento.PASIVO, Acciones.VOLAR, "rojo");
        Aguila aguila1= new Aguila("eagle", 1, 10, Comportamiento.AGRESIVO, Acciones.VOLAR, "medio ambiente", "grandes");
        Aguila.mostrarMensaje(aguila1.toString());
        Canario.mostrarMensaje(canario1.toString());
        Gato.mostrarMensaje(gato1.toString());
        Leon.mostrarMensaje(leon1.toString());
        dueño1.agregarGato(gato1);
        dueño2.agregarPerro(perro2);
        dueño2.agregarPerro(perro1);
        Dueño.mostrarMensaje(dueño1.toString());
        Dueño.mostrarMensaje(dueño2.toString());
    }
}
