/*
 CLASE PRINCIPAL / MADRE.
Tiene atributos y Métodos que todos los vehiculos tienen que tener. 

 */
package ejemplopoo;

/**
 *
 * @author Covid
 */
public class Vehiculo {
    
    //Atributos 
     int num_registro;
     int cant_ruedas;
     String marca;
     String modelo;
    
    //Contructor 

    public Vehiculo() {
    }

    public Vehiculo(int num_registro, int cant_ruedas, String marca, String modelo) {
        this.num_registro = num_registro;
        this.cant_ruedas = cant_ruedas;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    //Métodos Getter y Setters 

    public int getNum_registro() {
        return num_registro;
    }

    public void setNum_registro(int num_registro) {
        this.num_registro = num_registro;
    }

    public int getCant_ruedas() {
        return cant_ruedas;
    }

    public void setCant_ruedas(int cant_ruedas) {
        this.cant_ruedas = cant_ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    //Métodos personalizados 
    
    public void estacionar(){
        System.out.println("Estoy estacionando");
    }
}
