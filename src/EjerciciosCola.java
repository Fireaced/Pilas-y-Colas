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
    public Cola Ejercicio5(Cola c1, Cola c2){
        int aux1;
        int aux2;
        int numele;
        int num1=0;
        int num2= 0;
        if(c1.getNumElementos()< c2.getNumElementos()){
            numele = c1.getNumElementos();
        }else{
            numele = c2.getNumElementos();
        }
        Cola colamenores = new Cola();
for (int i =0;i<numele;i++){
    aux1 = c1.desencolar();
            aux2 = c2.desencolar();
            if(aux2<aux1){
                colamenores.encolar(aux2);
                c1.encolar(aux1);
                num2++;
            }else{
                colamenores.encolar(aux1);
                c2.encolar(aux2);
                num1++;
            }
        }
        for(int i=0;i< numele- num1;i++){
            aux1 = c1.desencolar();
            c1.encolar(aux1);
        }
        for(int i=0;i< numele - num2;i++){
            aux2 = c2.desencolar();
            c2.encolar(aux2);
        }
        return colamenores;
    }
    public Alumno Ejercicio6(ColaAlumnos cola){
        int num=0;
        int numele= cola.getNumElementos();
        Alumno aux;
        Alumno alumno = new Alumno();
        for (int i=0;i<numele;i++){
            aux= cola.desencolar();
            if(aux.GetCalificacion()>5){
                cola.encolar(aux);
                if(aux.GetCalificacion()>alumno.GetCalificacion()){
                    alumno = aux;
                }
            }
        }
        return alumno;
    }
    public void separarCola(Cola c, Pila p){
        int aux;
        int numele= c.getNumElementos();
        for(int i =1;i<=numele;i++){
            aux = c.desencolar();
            if(i%2!=0){
                p.apilar(aux);
            }else{
                c.encolar(aux);
            }
        }
    }
}
