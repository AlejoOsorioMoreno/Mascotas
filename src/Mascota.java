import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Mascota {
	Proceso proceso=new Proceso();
	int codigo;
    String nombre;
    String especie;
    int edad;
    /* 1. Creen n cantidad de mascotas //listo
    * 2. Almacenen esas mascotas en una estructura de datos
    * 3. Consulten mascotas individuales
    * 4. Consulten la lista de mascotas.
    * 
    * Deben diligenciar todos los atributos.
    * Creen por lo menos 2 metodos nuevos en la clase Mascota
    * 
    */
    //Constructor sin parametros
    public Mascota() {
    	
    }
	public void ingresar() {
    	codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la mascota"));
    	nombre = JOptionPane.showInputDialog("Ingrese nombre");
        especie = JOptionPane.showInputDialog("Ingrese especie");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la mascota"));

    }
    public Mascota(String nombre, String especie, int edad) {
    	this.codigo = codigo;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInformacion() {
    	System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    public void hacerSonido() {
        if (especie.equalsIgnoreCase("perro")) {
            System.out.println("¡Guau guau!");
        } else if (especie.equalsIgnoreCase("gato")) {
            System.out.println("¡Miau miau!");
        } else if(especie.equalsIgnoreCase("loro")) {
        	System.out.println("¿Quiere cacao?");
        } else if(especie.equalsIgnoreCase("Oso")) {
        	System.out.println("El Oso ruge"); 
        }else {
            System.out.println("La mascota no hace sonidos conocidos.");
        }
    }
    public void comer() {
        if (especie.equalsIgnoreCase("perro")) {
            System.out.println("El perro come!");
        } else if (especie.equalsIgnoreCase("gato")) {
            System.out.println("El gato come!");
        } else if(especie.equalsIgnoreCase("loro")) {
        	System.out.println("El Loro come!");
        } else if(especie.equalsIgnoreCase("Oso")) {
        	System.out.println("El Oso come!");
        }else {
            System.out.println("La mascota no hace sonidos conocidos.");
        }
    }
	public void jugar() {
        if (especie.equalsIgnoreCase("perro")) {
            System.out.println("Va por la pelota!");
        } else if (especie.equalsIgnoreCase("gato")) {
            System.out.println("Sube por las cortinas!");
        } else if(especie.equalsIgnoreCase("loro")) {
        	System.out.println("Vuela!");
        } else if(especie.equalsIgnoreCase("Oso")) {
        	System.out.println("Caza un pescado!");
        }else {
            System.out.println("La mascota no hace sonidos conocidos.");
        }
		
	}
    public void imprimirDatos(Proceso proceso) {
   	 HashMap<Integer, Mascota> mascota = proceso.getSizeMap();
   	Iterator iterator = mascota.keySet().iterator();
   	Mascota mascotas; Integer llave;
		while(iterator.hasNext()) {
           llave = (Integer) iterator.next();
           mascotas = proceso.getSizeMap().get(llave);
           System.out.println("ID: " + llave + ", Nombre: " + mascotas.nombre + ", edad: " + mascotas.edad 
               		+ " y especie " + mascotas.especie);
		}
		System.out.println("-----");
   }

}
