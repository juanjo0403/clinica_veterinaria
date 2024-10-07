/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datosCompletos");
        Veterinaria veterinaria= new Veterinaria("AYH", "CRA 22", "3173534320");
        assertEquals("AYH", veterinaria.getNombre());
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }
    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datosVacios");
        Dueño dueño1= new Dueño("Carlos", "sur", "314589635");
        assertThrows(Throwable.class , ()-> new Dueño(" ", " ", " "));
        LOG.info("Finalizando test datosVacios");
    }
    @Test
    public void agregarPerro() {
        LOG.info("Iniciado test agregarPerro");
        Dueño dueño2= new Dueño("Stefania","centro","3204567809");
        Perro perro1= new Perro("puky", 7, 8 , Comportamiento.PASIVO, Acciones.CORRER, "beagle");
        Perro perro2= new Perro("Sirius", 8, 15, Comportamiento.PASIVO, Acciones.DORMIR, "Criollo");
        dueño2.agregarPerro(perro2);
        dueño2.agregarPerro(perro1);
        assertTrue(dueño2.getPerros().contains(perro1));
        assertTrue(dueño2.getPerros().contains(perro2));
        assertEquals(2, dueño2.getPerros().size());
        LOG.info("Finalizando test agregarPerro");
    }
}
