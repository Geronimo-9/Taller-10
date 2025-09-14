public class Persona {
private String nombre;


public Persona(String nombre){
    this.nombre = nombre;
}



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public void presentarse(){
        System.out.println("Hola, mi nombre es "+nombre);
    }




}


class Profesor extends Persona {



    public Profesor(String nombre){
        super(nombre);
    }


    @Override
    public void presentarse(){
        System.out.println("Hola, soy el Docente "+getNombre());
    }

}


class Estudiante extends Persona{

    public Estudiante(String nombre){
        super(nombre);
    }

    @Override
    public void presentarse(){
        System.out.println("Hola, soy el Estudiante "+getNombre());
    }



}



