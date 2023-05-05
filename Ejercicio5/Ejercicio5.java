package Ejercicio5;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Ejercicio 5 Arrays de objetos, Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) 
 * para llevar el control de los artículos de un almacén. De cada artículo se debe saber el código,
 *  la descripción, el precio de compra, el precio de venta y el stock (número de unidades).
 * 
 * Nombre del fichero: Ejercicio5.java
 * 
 * Ampliación de Gestesimal, esta vez realizado con ArrayList.
 * 
 * @author Jorge Reina Romero
 */

public class Ejercicio5 {
  public static void main(String[] args) {

    Scanner datos = new Scanner(System.in);

    ArrayList<Articulos> a = new ArrayList<>();

    boolean salida = true;

    //Añadimos un articulo par que aparezca en el listado.
    a.add(new Articulos(0000, "Coca-Cola", 2.0, 3.5, 50));

    System.out.println();

    while (salida != false) {

      System.out.println("*");
      System.out.println("** BIENVENIDO A GESTISIMAL **");
      System.out.println("*");
      System.out.println("* MENU");
      System.out.println("*");
      System.out.println("* 1. LISTADO");
      System.out.println("* 2. ALTA");
      System.out.println("* 3. BAJA");
      System.out.println("A PARTIR DE AQUI NO SE COMO MODIFICAR EL ArrayList de Objetos.");
      System.out.println("* 4. MODIFICACION");
      System.out.println("* 5. ENTRADA DE MERCANCIA");
      System.out.println("* 6. SALIDA DE MERCANCIA");
      System.out.println("* 7. SALIR");
      System.out.println("*");

      //Salto de linea
      System.out.println();
      System.out.print("Elige alguna operacion: ");
      int opcion = datos.nextInt();
      //Salto de linea
      System.out.println();

      switch (opcion) {
        case 1:
            System.out.println("Lista de Obejtos");
            System.out.println();
            for (Articulos objetos : a) {
              System.out.println(objetos+"\n");
              System.out.println();
            }
            
            System.out.println();
          break;
        case 2:
            System.out.println("Introduce los datos del Articulo que quieres Introducir: ");
            System.out.println("Codigo: ");
            int c = datos.nextInt();
            System.out.println("Descripcion: ");
            String d = datos.next();
            System.out.println("Precio de compra: ");
            int pC = datos.nextInt();
            System.out.println("Precio venta: ");
            int pV = datos.nextInt();
            System.out.println("Cantidad: ");
            int s = datos.nextInt();

            a.add(new Articulos(c, d, pC, pV, s));
  
          break;
        case 3:
            
            System.out.println("Introduce el nombre del articulo que quieres eliminar: ");
            int eliminarCodigo = datos.nextInt();

            a.remove(eliminarCodigo);

          break;
        case 4:
            System.out.print("Introduce el numero de array del Articulo que quieres modificar: ");
            int modificar = datos.nextInt();

            System.out.println("ESTA PARTE NO FUNCIONA PORQUE NO SE COMO MODIFICAR LOS ELEMENTOS DEL OBJETO.");

            System.out.println("* 1. CODIGO");
            System.out.println("* 2. DESCRIPCION");
            System.out.println("* 3. PRECIO COMPRA");
            System.out.println("* 4. PRECIO VENTA");
            System.out.println("* 5. STOCK");
            System.out.println();
            System.out.println("Elige que campo quieres modificar: ");
            int opcion2 = datos.nextInt();

            switch (opcion2) {
              case 1:
                  
                break;
              case 2:
                  
                break;
              case 3:
                  
                break;
              case 4:
                  
                break;
              case 5:
                  
                break;
              default:
              System.out.println("Opcion incorecta.");
                break;
            }
            
          break;
        case 5:
            System.out.print("Seleccione el numero de array del articulo que entra: ");
            int entra = datos.nextInt();
            System.out.println();

            System.out.print("Que cantidad de stock entra: ");
            int cantidad = datos.nextInt();

            

            System.out.println();
            System.out.println("El stock se ha modificado correctamente.");
            System.out.println();

          break;
        case 6:
          System.out.print("Seleccione el numero de array del articulo que sale: ");
          int sale = datos.nextInt();
          System.out.println();

          
          System.out.print("Que cantidad de stock sale: ");
          int cantidadSale = datos.nextInt();

            System.out.println();
            System.out.println("El stock se ha modificado correctamente.");
            System.out.println();
          

          break;
        case 7:
            salida = false;
          break;
      
        default:
          break;
      }
    }
    
  }
}
