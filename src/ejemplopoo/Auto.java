/*
 /*

 CREAMOS UN PROYECTO
2- VAMOS AL PAQUETE PRINCIPAL DEL PTOYECTO 
Source Packages -> "nombre del paquete principal " 
3- click derecho "NEW"
4- CLICK EN "java class"
5- nos pide poner un nombre para nuestra CLASE 
Estandar: nombres en Mayúscula y sin tilde ni simbolos especiales  (Verbos infinitivos y en minuscula como los métodos)
Le ponemos "Auto" y finish 
ESTRUCTURA DE LA CLASE 

public: palabra reservada del modificador de acceso
class: indica es una clase 
Palabra en mayus: nuestra clase 

6- Ahora hay que declarar los ATRIBUTOS de la clase
(pensarlo como variables de manera sensilla )
7- declarar los atributos 
    int id; 
    String patente; 
    int cant_puertas;
    String color; 
    boolean caja_manual;
8- declarar los MéTODOS (lo que puede hacer el auto)
ORDEN 

public (Va primero el modificador de acceso(desde donde se puede acceder al metodo)
+
tipo de dato que retorna en caso que lo haga 
FUNCIONES O PROCEDIMIENTO (bloques de codigo que hacen una funcion en particular)

(void: tipo de dato que se utiliza cuando no devuelve ningun valor)
+
Nombre en infinitivo y en miniscula 
+
() los parametros puede tener o no, segun lo que se necesite. 
+
apertura y cierre de corchetes
+
mensaje que va mostrar 
si ponemos "sout"+tab se auto completa 
System.out.println("aca va nuestro mensaje "); (esto es una sentencia)


9- Contructores 

En este caso vamos a construir uno vacío 
no recibe ningun párametro. 
Y OTRO por PÁRAMETRO 

10- nos vamos a EjemploPOO nuestro principal 

vamos a crear un objeto vacio 
vamos a crear un objeto con parametros 

11- Declaro al objeto 

Constructor vacio 
nombre del objeto en mayúscula + nombre que quiero que tenga mi objeto (en minuscula)
+ 
=
+
palabra reservada NEW (INSTANSCIA UN NUEVO OBJETO DE TIPO AUTO, en este caso)
+
nuestra clase en mayuscula + (); parentesis vacio si va a ser un constructor vacio 

constructor por parametros 

nombre del objeto en mayúscula + nombre que quiero que tenga mi objeto (en minuscula)
+ 
=
+
palabra reservada NEW (INSTANSCIA UN NUEVO OBJETO DE TIPO AUTO, en este caso)
+
nuestra clase en mayus + (aca aprentar ctrl+space) para que nos de los valores que tenemos que poner
+ 
ponerle valor a los argumentos del párametro. 

12- ACCEDER A UN MÉTODO 
Selecciono el objeto, la instancia que tenemos creada del auto y llamamos con el puntito . cada uno 
de sus métodos. 
Los que no tengan párametros simplemente no hace nada. 
    Escribimos el nombre de nuestro objeto este caso auto2+ . (acá ya nos aparecen los métodos que hay asociados a auto2)



13- METODOS GETTER/ SEETER 
Por convención: antes de los métodos personalizados vamos los GETTER/SETTERS 

AUTO COMPLETADO 
ALT+INSERT 
Menú despleglable 
getter and setter
select all + generate 
14- vamos a nuestro clase principal EJEMPLOPOO.java
 y asignamos o modificamos valores de nuestra clase y la mostramos en la pantalla 
ej: 
auto1.setId(100); //le asigno un valor a auto1
        System.out.println("El nuevo valor de la id de auto1 es: "+ auto1.getId()); //muestro su nuevo id 


15- Método toString 
por convencion se ponen después de los getter y setter 

alt+insert 
toSTtring
seleccionamos todo + genereate 

16- vamos a nuestro EjemploPOO devuelta 
e implemnetamos nuestro metodico 

System.out.println(auto2.toString());
        System.out.println(auto1.toString());


17-HERENCIA TIME 
los atributos de la clase deben estar private 

18- Creamos una nueva clase "Vehículo" y "Camion"

Haciendo click derecho sobre "ejemplopoo"+ new + javaClass

19- LA NUEVA CLASE VEHICULO ES NUESTRA MAMA 
Colocamos sus atributos, metodos y constructores correspondientes. 

20- Dentro de la nueva clase camion y moto 
Colocamos sus atributos metodos y constructores correspondietes mas sus herencias

21- Ahora a Auto lo hacemos hijo de Vehiculo 

22- El constructor al momento solo contempla los valores de auto que teniamos 
HAY QUE REALIZAR LA HERENCIA DE VEHICULO 
23- Borro el constructor que no tenia en cuenta la herencia 

24- alt+insert. Constructor+ seleccionar todo + genereate
////////////////////


LAS CLASES SIRVEN DE MOLDE PARA PODER CREAR OBJETOS con sus caracteristicas(un patroin)

Para poder crear objetos necesitamos un tipo de método que se llama: "METODO CONSTRUCTOR" 
otra convención para los nombres es que NO lleva tilde 
¿Qué es un Objeto?
 
Le damos valores a la clase. 
Resultado de poder darle datos a una clase,y obtener la construcción de un objeto en la vida real. 

¿Qué es un CONSTRUCTOR? Y ¿Qué tip de constructores hay?

Métodos especiales en POO
Nos permite crear dos tipos de objetos 
Constructor Vacío -> Para crear un objeto vacío. Para usar solo sus métodos o cuando no sabemos los valores que puedan inicialmente tener. 

Contructor por PÁRAMETROS -> Le pasamos los valores iniciales para los objetos. 
Le damos valores a los meétodos de los objetos. 


Por convencio los constructores van declarados después de los atributos y antes de los métodos 
tips1: Se pueden escribir manualmente como se hace un constructor 
tips2: Se puede usar el autocompletado de netbeans del constructor. 
alt+ insert y se abre un menu desplegable + constructor 
sino click derecho + inset code + constructor 


cuando el constructor es vacío no tildamos ninugna opcion porque no queremos que tenga ningun valor. + GENERATE 
Cuando el constructor es uno por PÁRAMETROS + SELECT ALL / Seleccionar cada uno manualmente + GENERATE

EL NOMBRE DEL CONSTRUCTOR SIEMPRE VA A TENER EL MISMO NOMBRE DE LA CLASE. 

No tiene tipo de dato que retorna. 


HAY DOS TIPOS DE VARIABLES LOCALES Y GLOBALES por eso pueden haber mas de una con el nombre IGUAL. 

LOS ATRIBUTOS SE CONSIDERAN -> VARIABLES GLOBALES, se pueden usar a lo largo de todo el código sin necesidad de declararla en cada uso.  



MÉTODOS GETTERS Y SETTERS 
SOLO SE SOBREESCRIBE UN METODO SI QUIERO CAMBIAR DE IMPLEMENTANCIÓN 


Los métodos pueden ser o FUNCIONES O PROCEDIMIENTOS 
Funciones: retorna un valor -> GETTER 
Procedimiento: Realiza una accion concreta.  -> SETTER 

public int  getID(){    -> GETTER, traer y conocer valores. 
    
    return id;
}
public void setId(int id){ -> SETTER , crear valores o modificarlo. 
    
    this.id = id;
}

MÉTODO toString
A ESOS VALORES QUE TENGO DENTRO DE UN OBJETO, MOSTRAR TODOS LOS VALORES EN LA PANTALLA DE UNA. 
@Override String toString(){
    return "Alumno{" + "id=" + id +
            ", nombre=" + nombre +
            " , apellido=" + apellido + }
}
AUTO COMPLETADO 
ALT+INSERT 
Menú despleglable 
getter and setter
Getter
Setter 
toString 




HERENCIA/POLIMORFISTMO/ ENCAPSULAMIENTO

1-ENCAPSULAMIENTO 
Es una propiedad de POO, nos permite encapsular distintas partes del código dentro de una clase 
tal manera que el programa pueda tener acceso/visto o utilizado a ellas o no. 

Tenemos acceso a cada uno de los método o atributos que utilicemos pero 
determindados niveles de acceso, según el uso que vayamos a darle. 

3 tipos de acceso o niveles de acceso o modificadores de acceso. 
PRIVADO -> private 
Si no pongo un modificador de acceso net beans y java lo pone como publixo
Nivel mas alto de proteccion en encapsulamiento. Solo puede ser accedido dentro de la misma clase. 
Ahora solo la clase auto puede acceder a datos de auto 


PÚBLICO-> public 

PROTEGIDO -> es el intermediario entre publico y privado 
Hace una combinación Herencia, solo lo ve la clase la que estoy parado ahora y las clases hijes de las padre/madre 

2- HERENCIA 
Podemos tener concepto de clase madre/padre la cual va a tener atributos y métodos 
la cual va a tener hijes con los atributos/métodos de su madre ademas de los suyos. 

3- POLIMORFISMO 

Cuando hay una clase madre/padre que tenga hijes que dependen de ella, si yo creo 
un objeto a partir de la clase  madre/padre sus hijes van a poder tener acceso a este nuevo objeto



 */

package ejemplopoo;

/**
 *
 * @author Covid
 */
public class Auto extends Vehiculo{
    
    //declarando atributos -> tienen que ser privados 
    //El manejo exclusivo de los datos de la clase auto va a ser dentro y solo en su misma clase 
    private int id; 
    private String patente; 
    private int cant_puertas;
    private String color; 
    private boolean caja_manual;
    
    //Constructores 

    public Auto() { //constructor vacío / public encapsulamiento público.
        
    }
//CONSTRUCTOR QUE CONTEMPRA LOS ATRI PROPIOS DE AUTO Y LOS DE VEHICULO
    public Auto(int id, String patente, int cant_puertas, String color, boolean caja_manual , int num_registro, int cant_ruedas, String marca, String modelo) {
        super(num_registro, cant_ruedas, marca, modelo);
        this.id = id;
        this.patente = patente;
        this.cant_puertas = cant_puertas;
        this.color = color;
        this.caja_manual = caja_manual;
      
    }
//Acá cuando pongo para hacer el constructor me aparece un any raro, lo borro y anda pero nose porque aparece 
   
    
    /*
    ESTE CONSTRUCTOR NO ESTA HEREDANDO LOS ATRIBUTOS DE LA CLASE MADRE VEHICULO 
    */
    public Auto(int id, String patente, int cant_puertas, String color, boolean caja_manual) {//CONSTRUCTOR POR PÁRAMETRO. 
        /*
        LOS PÁRAMETROS DE ESTE CONSTRUCTOR SON VARIABLES LOCALES. 
        */
       
        this.id = id;
        this.patente = patente;
        this.cant_puertas = cant_puertas;
        this.color = color;
        this.caja_manual = caja_manual;
    }
    
    //declarando métodos 
    
    //Métodos getter/setters

    private int getId() {
        return id;  //Retorna la id que tenga asignada como atributo mi clase y/o objeto. El valor GLOBAL de id. 
    }

    public void setId(int id) {
        this.id = id;   //Asigna como si fuese un constructor, SOBREESCRIBE la id que quieras. 
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCant_puertas() {
        return cant_puertas;
    }

    public void setCant_puertas(int cant_puertas) {
        this.cant_puertas = cant_puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCaja_manual() {
        return caja_manual;
    }

    public void setCaja_manual(boolean caja_manual) {
        this.caja_manual = caja_manual;
    }
    //Método toString 

    @Override
    public String toString() {
        return "Auto{" + "id=" + id + 
                ", patente=" + patente + 
                ", cant_puertas=" + cant_puertas + 
                ", color=" + color + 
                ", caja_manual=" + caja_manual + '}';
    }
    
    
    //MÉTODOS personalizados 
    public void encender(){
        System.out.println("Estoy encendiendo");
    }
    public void apagar(){
        System.out.println("Estoy apagando");
    }
    public void acelerar(double km){
        System.out.println("Estoy acelerando " + km + "kms");
    }
    public void frenar(double km){
        System.out.println("Estoy frenando " + km + "kms");
    }
   
}
