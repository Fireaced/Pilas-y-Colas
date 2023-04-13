public class EjerciciosPila {


    public Pila Ejercicio1(Pila pila, int num) {
        int aux;
        if (!pila.vacia()) {
            aux = pila.desapilar();
            Ejercicio1(pila, num);
            for (int j = 0; j < num; j++) {
                pila.apilar(aux);
            }
        }
        return pila;
    }

    public Pila Ejercicio2(Pila pila, int num) {

        eliminar(pila, num);
        pila.apilar(num);
        return pila;
    }

    private void eliminar(Pila pila, int num) {
        int aux;
        if (!pila.vacia()) {
            aux = pila.desapilar();
            eliminar(pila, num);
            if (aux != num) {
                pila.apilar(aux);
            }
        }
    }

    public int Ejercicio3(Pila pila) {
        if (Numfinal(pila) < pila.getNumElementos()) {
            return -1;
        } else if (Numfinal(pila) > pila.getNumElementos()) {
            return 1;
        } else {
            return 0;
        }

    }

    private int Numfinal(Pila pila) {
        int aux;
        int num = 0;
        if (pila.getNumElementos() > 1) {
            aux = pila.desapilar();
            num = Numfinal(pila);
            pila.apilar(aux);
        } else {
            aux = pila.desapilar();
            pila.apilar(aux);
            return aux;
        }
        return num;
    }

    public Pila Ejercicio4(Pila pila, int num) {
        if (pila.getNumElementos() < num) {
            return pila;
        } else {
            eliminar(pila, num, pila.getNumElementos());
        }
        return pila;
    }

    private Pila eliminar(Pila pila, int num, int numele) {
        int aux = 0;
        if (!pila.vacia()) {
            aux = pila.desapilar();
        }
        if (pila.getNumElementos() + num != numele) {
            eliminar(pila, num, numele);
            pila.apilar(aux);
        }
        return pila;
    }

    public Pila Ejercicio5(Pila pila) {
        pila.apilar(Numfinal5(pila));
        return pila;
    }

    private int Numfinal5(Pila pila) {
        int aux;
        int num = 0;
        if (pila.getNumElementos() > 1) {
            aux = pila.desapilar();
            num = Numfinal5(pila);
            pila.apilar(aux);
        } else {
            aux = pila.desapilar();
            return aux;
        }
        return num;
    }

    /*public void Ejercicio6(Pila pila){

    }*/
    public int Ejercicio7(Pila pila, int num) {
        int aux;
        int numel = 0;
        if (!pila.vacia()) {
            aux = pila.desapilar();
            if (aux == num) {
                return Ejercicio7(pila, num) + 1;
            } else {
                numel = Ejercicio7(pila, num);
                pila.apilar(aux);
            }


        }
        return numel;
    }

    public int Ejercicio8(Pila pila) {
        int aux = 0;
        int num = 0;
        if (!pila.vacia()) {
            aux = pila.desapilar();

            num = Ejercicio8(pila);
            if (aux > num) {
                num = aux;
            }
            pila.apilar(aux);
        }
        return num;
    }

    public Pila Ejercicio9(Pila pila) {
        Pila pila2 = new Pila();
        int aux;
        int numel = 0;
        if (!pila.vacia()) {
            aux = pila.desapilar();
           pila2 = posicionPar(pila);
            pila.apilar(aux);

        }
    return pila;
    }

    private Pila posicionPar(Pila pila) {
        Pila pila2 = new Pila();
        int aux;
        if (!pila.vacia()) {
            aux = pila.desapilar();
           pila2= Ejercicio9(pila);
            pila2.apilar(aux);

        }
        return pila2;
    }
    public void Ejercicio10(Pila pila){
        int aux;
        int max = Ejercicio8(pila);
        int min = Nummin(pila);
       Insertardif(pila,max-min);
    }
    private void Insertardif(Pila pila, int num){
        int aux;
        if(!pila.vacia()){
            aux = pila.desapilar();
            Insertardif(pila,num);
            pila.apilar(aux);
        }else {
            pila.apilar(num);
        }
    }
    private int Nummin (Pila pila){
        int aux;
        int num =999999999;
        if (!pila.vacia()) {
            aux = pila.desapilar();

            num = Nummin(pila);
            if (aux < num) {
                num = aux;
            }
            pila.apilar(aux);
        }
        return num;
    }
}