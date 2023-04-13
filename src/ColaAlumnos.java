/**
 * Clase para gestionar una cola
 * Esta clase se entrega desarrollada, pero se tiene que modificar para que la cola tenga String como
 * elementos en vez de int
 *
 * @author Pilar Martinez Garcia
 * @version 1.0
 */
public class ColaAlumnos {
    /**
     * Referencias al principio y al final de la lista
     */
    private NodoAl principio, fin;
    /**
     * número de elementos que contiene la lista
     */
    private int numElementos;

    /**
     * Constructor de la clase, prepara la cola para su utilización
     */
    public ColaAlumnos() {
        principio = null;
        fin = null;
        numElementos = 0;
    }

    /**
     * Método que verifica si la cola tiene algún elemento
     * @return true si está vacía, false si tiene elementos
     */
    public boolean vacia() {

        return principio == null;
    }


    /**
     * Método que inserta un nuevo elemento al final de la cola
     * @param dato el elemento a insertar
     */
    public void encolar(Alumno dato) {
        NodoAl nuevo;
        nuevo = new NodoAl(dato, null);
        if (principio != null)
            fin.setSiguiente(nuevo);
        else principio = nuevo;
        fin = nuevo;
        numElementos++;
    }

    /**
     * Método que extrae de la cola el elemento que aparece al principio
     * @return el primer elemento de la cola. Devuelve una cadena vacía si la cola está vacía
     */
    public Alumno desencolar() {
        NodoAl nodo;
        Alumno resultado = new Alumno();

        if (principio == null)
            System.out.println("Error, la cola está vacía");
        else {
            nodo = principio;
            principio = nodo.getSiguiente();
            resultado = nodo.getDato();
            if (principio == null)
                fin = null;

            numElementos--;
        }
        return resultado;
    }

    /**
     * Método que muestra por pantalla el contenido de la cola
     */
    public void mostrar() {     // Muestra por pantalla el contenido de la cola
        NodoAl auxiliar;
        System.out.println("Contenido de la cola: ");
        auxiliar = principio;
        while (auxiliar != null) {
            auxiliar.getDato().Mostrar();
            auxiliar = auxiliar.getSiguiente();
        }
        System.out.println("FIN");
    }

    /**
     * Método para comprobar el número de elementos que contiene la cola
     * @return el número de elementos que contiene la cola
     */
    public int getNumElementos() {       // Devuelve el número de elementos de la cola
        return numElementos;
    }
}
