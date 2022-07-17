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
public class EjemploPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /*
        A LA HORA DE DECLARAR OBJETOS LOS TRATO COMO VARIABLES
        NEW= Palabra reservada para asignarle a auto1 las caracteristicas del objeto Auto.
        */
        Auto auto1 = new Auto();
        //PROBANDO POLIMORFISMO 
        /*
        Tanto auto como moto y camion son hermanes. Vehiculo es la madre 
        
        
        */
        Vehiculo vehi = new Vehiculo (3, 5, "MaiteBens", "VayaASaber");
        Auto auto2 = new Auto(1, "MAITE12", 3, "negro", true, 5, 5, "MaiteBens", "2022"); // para autocompletarlo tuve que poner ctrl+space 
        Moto moto1 = new Moto(12, 5, 3232, "MaiteBens", "072022");
        Camion camion1 = new Camion(5, true, 5050, 6, "MaiteBens", "162020");
        
        Vehiculo vector[] = new Vehiculo [4]; //Creamos un vector de cuatro posiciones que puede guardar vehiculos 
        vector[0] = vehi;
        vector[1] = auto2;
        vector[2] = moto1;
        vector[3] = camion1; 
        
        for (int i=0; i<4; i++ ){
            System.out.println("Registro N° "+ i + vector[i].getMarca());
        }
        
   
      /*
        Pruba de métodos personalizados.
        auto2.encender();
        auto2.acelerar(60);
        auto2.frenar(30);
        auto2.apagar();
        
      */
        //para poder mostrarlo por pantalla tengo que ponerlo dentro de un 
        //System.out.println("");
        /*
        EJEMPLOS DE MÉTODOS GETTER Y SETTERS 
        System.out.println("El valor de la id es: " + auto2.getId());
        auto2.setId(3500);  //modificando la id 
        System.out.println("El nuevo valor de la id es: " + auto2.getId());
        System.out.println("La id de auto1 es: " + auto1.getId());  //id cero por defecto 
        auto1.setId(100); //le asigno un valor a auto1
        System.out.println("El nuevo valor de la id de auto1 es: "+ auto1.getId()); //muestro su nuevo id 
        System.out.println("El color del auto1 es: " + auto1.getColor()); // esto da null porque esta vacío. 
        auto1.setColor("negro");
        auto1.setCaja_manual(false);
        auto1.setCant_puertas(3);
        auto1.setPatente("MAITE1010");
        System.out.println("El nuevo color del auto1 es: " + auto1.getColor());
        System.out.println("auto1 tiene caja manual? " + auto1.isCaja_manual());
        System.out.println("El auto1 tiene "+  auto1.getCant_puertas()+ " puertas " );
        System.out.println("La patente de auto1 es: " + auto1.getPatente());
        
        */
        
        /* EJEMPLO DE MÉTODO toString 
        
        
        auto2.toString(); //acá recivo una cadena de caracteres. pero no hago nada con lo que recibo
        System.out.println(auto2.toString());
        System.out.println(auto1.toString());
        */
        //probando encapsulamiento 
        //System.out.println("La id del auto2 es: " + auto2.getId());// solo anda si el método es público 
        //Si yo pongo "auto2. el puntito me muestra que metodos y atributos son publicos 
  
     
    }
    
}
