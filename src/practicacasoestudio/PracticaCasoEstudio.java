/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicacasoestudio;

/**
 *
 * @author josed
 */
public class PracticaCasoEstudio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Recursion r = new Recursion();

        System.out.println("Suma de divisores de 6: " + r.SumaDivisores(6, 1));



        Cola c = new Cola();
        c.agregar(new Persona(1, "Juan"));
        c.agregar(new Persona(2, "Ana"));
        c.agregar(new Persona(3, "Pedro"));
        c.agregar(new Persona(4, "Luis"));
        c.MostrarNombresConsonantes();
        c.buscarNombreCorto();
        System.out.println(c);
        c.atender();
        System.out.println(c);
        System.out.println(c);
        


    }
    
}
