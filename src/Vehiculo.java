public class Vehiculo {
    private String tipo;


    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public void moverse(){
        System.out.println("El Vehiculo "+tipo+" Se esta moviendo");
    }




}

class Bicicleta extends Vehiculo{

        public Bicicleta(String tipo){
            super(tipo);
        }
 @Override
 public void moverse(){
     System.out.println("La Bicicleta "+getTipo()+" Empezó a rodar");
 }


}