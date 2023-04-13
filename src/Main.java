public class Main {
    public static void main(String[] args) {
     /* Pila pila= new Pila();
      EjerciciosPila ejerciciosPila = new EjerciciosPila();
        pila.apilar(57);
      pila.apilar(2);
      pila.apilar(1);
      pila.apilar(2);
        pila.apilar(23);
      pila.apilar(2);
      pila.apilar(2);
      pila.apilar(108);



      pila.mostrar();
      //ejerciciosPila.Ejercicio1(pila,2).mostrar();
        //ejerciciosPila.Ejercicio2(pila,1).mostrar();
       // ejerciciosPila.Ejercicio2(pila,5).mostrar();
      //  System.out.println(ejerciciosPila.Ejercicio3(pila));
       // ejerciciosPila.Ejercicio4(pila,7).mostrar();
    //  ejerciciosPila.Ejercicio5(pila).mostrar();
    //  System.out.println("NUMERO ELIMINADO "+ ejerciciosPila.Ejercicio7(pila,2));
      //System.out.println(ejerciciosPila.Ejercicio8(pila));
     // ejerciciosPila.Ejercicio9(pila).mostrar();
      ejerciciosPila.Ejercicio10(pila);
        pila.mostrar();*/
      Cola cola = new Cola();
      EjerciciosCola ejerciciosCola = new EjerciciosCola();
      cola.encolar(1);
      cola.encolar(3);
      cola.encolar(2);
      cola.encolar(4);
      cola.encolar(5);
      cola.encolar(1);

      cola.mostrar();
     /* ejerciciosCola.Ejercicio1(cola);
      cola.mostrar();*/
       /* System.out.println(ejerciciosCola.Ejercicio2(cola,3));
        cola.mostrar();*/
      /*Cola cola2 = new Cola();
      cola2.encolar(5);
      cola2.encolar(8);
      cola2.encolar(0);
      cola2.encolar(5);
      cola2.encolar(1);
      cola2.encolar(2);
      cola2.mostrar();*/
      //ejerciciosCola.Ejercicio3(cola,cola2).mostrar();
     // ejerciciosCola.Ejercicio4(cola);
      //ejerciciosCola.Ejercicio5(cola,cola2).mostrar();
     // cola.mostrar();
     // cola2.mostrar();
     /*   ColaAlumnos colaAlumnos = new ColaAlumnos();
        Alumno alumno1 = new Alumno("Oscar",3);
        Alumno alumno2 = new Alumno("Juan",7.5f);
        Alumno alumno3 = new Alumno("Ana",7.5f);
        Alumno alumno4 = new Alumno("Eva",6);
      Alumno alumno5 = new Alumno("Sergio",4);
        colaAlumnos.encolar(alumno1);
        colaAlumnos.encolar(alumno2);
        colaAlumnos.encolar(alumno3);
        colaAlumnos.encolar(alumno4);
        colaAlumnos.encolar(alumno5);
        colaAlumnos.mostrar();
        ejerciciosCola.Ejercicio6(colaAlumnos).Mostrar();
        colaAlumnos.mostrar();*/
        Pila pila = new Pila();
        ejerciciosCola.separarCola(cola,pila);
        pila.mostrar();
        cola.mostrar();
    }
}