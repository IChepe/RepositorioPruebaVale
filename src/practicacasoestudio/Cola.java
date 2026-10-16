package practicacasoestudio;
import javax.swing.JOptionPane;
public class Cola {

    
    private Nodo prim, ult;

    public boolean vacia() {
        return prim == null;
    }


 //Encolar

     public void agregar (Persona p){
        Nodo nuevo = new Nodo(p);
        if (vacia()) {
            prim = ult = nuevo;
        }else {
            ult.setSiguiente(nuevo);
            ult = nuevo;
        }

    }


     public void atender(){
        if (!vacia()) {
           prim = prim.getSiguiente();
           if (prim == null) {
               ult = null;
           }
        }else {
            JOptionPane.showMessageDialog(null, "Cola vacia");
        }
     }




     

     public String toString() {

        String r = "Cola: \n";
        Nodo aux = prim;
        while (aux != null) {
            r += aux+"\n";
            aux = aux.getSiguiente();
        }

        return r;
    }

    //Buscar nombre mas corto


    public void buscarNombreCorto() {
        if (!vacia()) {
            Nodo aux = prim;
            String nombreCorto = aux.getDato().getNom();
            while (aux != null) {
                if (aux.getDato().getNom().length() < nombreCorto.length()) {
                    nombreCorto = aux.getDato().getNom();
                }
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "El nombre más corto es: " + nombreCorto);
        } else {
            JOptionPane.showMessageDialog(null, "Cola vacía");
        }
    }

    //Mostrar nombres con la cantidad de Consonantes
  
    
    public void MostrarNombresConsonantes(){
        if (!vacia()) {
            Nodo aux = prim;
            String nombreCorto = aux.getDato().getNom();
            while (aux != null){

                String nombre = aux.getDato().getNom();
                int cantidadConsonantes = contarConsonantes(nombre);
                JOptionPane.showMessageDialog(null, "El nombre: " + nombre + " tiene " + cantidadConsonantes + " consonantes.");
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Fin de la lista de nombres.");
        } else {
            JOptionPane.showMessageDialog(null, "Cola vacía");
        }

    }


    public int contarConsonantes(String nombre) {
        int cantidad = 0;
        for (int i = 0; i < nombre.length(); i++) {
            char c = Character.toLowerCase(nombre.charAt(i));
            if (Character.isLetter(c) && !"aeiou".contains(String.valueOf(c))) {
                cantidad++;
            }
        }
        return cantidad;
    }


//CODIGO CODIGO CODIGO CODIGO CODIGO CODGIO 
    
    








}
