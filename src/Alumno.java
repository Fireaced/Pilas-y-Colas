public class Alumno {
    String nombre;
    float calificacion;
    Alumno(){
        this.nombre= null;
        this.calificacion = 0;
    }
    Alumno (String nombre, float calificacion){
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void SetNombre(String nombre){
        this.nombre = nombre;
    }
    public float GetCalificacion(){
        return this.calificacion;
    }
    public void SetCalificacion(float calificacion){
        this.calificacion = calificacion;
    }
    public void Mostrar(){
        System.out.println(getNombre() +" "+ GetCalificacion());
    }
}
