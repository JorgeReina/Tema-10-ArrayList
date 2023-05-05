package Parte2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *  Parte 2 de la Practica 10.1, Ejercico con ArrayList.
 * 
 *  @author Jorge Reina Romero
 */

public class Ejercicio1 {
  public static void main(String[] args) {
    
    Productos vaso = new Productos("vaso", 5);
    Productos plato = new Productos("plato", 5);
    Productos cuchara = new Productos("cuchara", 5);
    Productos tenedor = new Productos("tenedor", 5);
    Productos bandeja = new Productos("bandeja", 5);

    ArrayList<Productos> p = new ArrayList<>();

    p.add(vaso);
    p.add(plato);
    p.add(cuchara);
    p.add(tenedor);
    p.add(bandeja);

    Iterator<Productos> iter = p.iterator();

    while (iter.hasNext()) {
      Productos productos = iter.next();
      System.out.println(productos); 
    }

    p.remove(tenedor);
    p.remove(plato);

    p.add(1, plato);

    while (iter.hasNext()) {
      Productos productos = iter.next();
      System.out.println(productos); 
    }

    p.removeAll(p);


  }
}
