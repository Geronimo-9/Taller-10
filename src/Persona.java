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


class Aspirante extends Estudiante{

    public Aspirante(String nombre){
        super(nombre);

    }





    //Este es el primer error. Ocurre cuando se intenta sobreescribir el metodo con diferentes firmas
    /* @Override
    public void presentarse(String nombre){
        System.out.println("Hola, soy el Aspirante "+geNombre());
    }
    */


    public void presentarse(String nombre){
        System.out.println("Hola, soy el Aspirante "+nombre);
    }

    /*
    Aunque el compilador lo puede ejecutar, es una mala práctica
    porque Al hacer esto, estamos sobrecargando metodos que pueden ser
   accesibles de acuerdo al tipo de firma sin sobreescribir
   adecuadamenete el metodo al heredarlos de la clase padre,
   creando metodos ambiguo a la hora de desarrollar aplicaciones
   donde la comunicación es crítica de alto impacto.
     */



}



