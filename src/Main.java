public class Main {
    public static void main(String[] args) {




        //Ejercicio 1, Sobreescribiendo metodos, Haciendo Polimorfismo entre diferentes instancias.
 Persona p1 = new Persona("Gerardo");
 p1.presentarse();

 Profesor d1 = new Profesor("Guillermo");
 d1.presentarse();

 Estudiante e1 = new Estudiante("Geronimo");
 e1.presentarse();


 // Ejercicio 2, Sobreescritura de metodos
 Vehiculo v1 = new Vehiculo("BMW");
 v1.moverse();

 Bicicleta b1 = new Bicicleta("Boost");
 b1.moverse();



//Ejercicio 3, EL uso inadecuado de sobreescritura. --> ir a Clase Persona

Aspirante a1 = new Aspirante("Jhon");

a1.presentarse();
a1.presentarse("helio");






    }
}