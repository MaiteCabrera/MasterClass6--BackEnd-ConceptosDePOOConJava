/*
 Camión es un hije de Vehículo. 
 Camión HEREDA DE VEHICULO 
Sus atributos, constructores y métodos. 
Palabra reservada 
extends -> extiende
 */
package ejemplopoo;

public class Camion extends Vehiculo{
    
    //atributo propio 
     int cant_ejes;
     boolean acoplado;
    
    
    //constructor (ahora aparecen los contructores de VEHICULO Y DE CAMION, PORQUE ES HIJA DE VEHICULO)
    
    public Camion() {
    }

    public Camion(int cant_ejes, boolean acoplado, int num_registro, int cant_ruedas, String marca, String modelo) {
        super(num_registro, cant_ruedas, marca, modelo);// SUPER: a mi madre la que esta arriba, y traeme los atributos que tiene ella, asignale los valores que recibo acá.
        this.cant_ejes = cant_ejes;
        this.acoplado = acoplado;
    }
    
    //métodos GETTER Y SETTERS(PROPIOS Y LOS HEREDADOS(no se ven pero estan) )

    public int getCant_ejes() {
        return cant_ejes;
    }

    public void setCant_ejes(int cant_ejes) {
        this.cant_ejes = cant_ejes;
    }

    public boolean isAcoplado() {
        return acoplado;
    }

    public void setAcoplado(boolean acoplado) {
        this.acoplado = acoplado;
    }

    
    
    
}
