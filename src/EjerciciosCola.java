public class EjerciciosCola {

    public void Ejercicio1(Cola cola){
        int aux;
        if(!cola.vacia()){
            aux = cola.desencolar();
            Ejercicio1(cola);
            cola.encolar(aux);
        }
    }
    public int Ejercicio2(Cola cola,int num){
        int aux;
        int pos=0;
         aux = cola.desencolar();
        if(aux!=num){
         pos= Ejercicio2(cola,num)+1;
         cola.encolar(aux);
        }else {
            cola.encolar(aux);
            return pos+1;
        }
        for(int i=0;i<cola.getNumElementos()+pos;i++){
            aux= cola.desencolar();
            cola.encolar(aux);
        }
        return pos;
    }
    public Cola Ejercicio3(Cola cola1, Cola cola2){
        Cola cola = new Cola();
        int aux;
        for(int i=0; !cola1.vacia() || !cola2.vacia();i++){
            if(!cola1.vacia() && !cola2.vacia()){
                if(i%2==0){
                    aux = cola1.desencolar();
                }else {
                    aux = cola2.desencolar();
                }
                cola.encolar(aux);
            } else if (cola1.vacia()) {
                aux = cola2.desencolar();
                cola.encolar(aux);
            } else if (cola2.vacia()) {
                aux = cola1.desencolar();
                cola.encolar(aux);
            }
        }
        return cola;
    }
    public void Ejercicio4(Cola c){
        int num = 1;
        int numelei = c.getNumElementos();
        int aux=c.desencolar();
        int sum=aux;
        if(aux%2!=0){
            while (aux%2!=0){
                aux= c.desencolar();
                if(aux%2!=0){
                    sum+= aux;
                    num++;
                }else {
                    c.encolar(aux);
                }
            }
            c.encolar(sum);
        }else{
            c.encolar(aux);
        }
       for(int i=0;i< numelei - num;i++){
            aux = c.desencolar();
            c.encolar(aux);
        }
    }
}
