/**
 *
 * @author Sergio García Domínguez
 */
import java.util.Scanner;

public class crud {
  /*
    Funciones:
      1. Listado
      2. Nueva memoria
      3. Editar
      4. Borrar
   */
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String[] procesador = {"6500K", "6700K", "3570K", "2600K"};
    
    System.out.println("Introduzca el número de la acción que desea realizar:");
    System.out.println(" 1. Listado");
    System.out.println(" 2. Nueva memoria");
    System.out.println(" 3. Editar");
    System.out.println(" 4. Borrar");
    
    int accion = Integer.parseInt(s.nextLine());
    switch (accion) {
      case 1:
        listar(procesador);
        break;
      case 2:
        
        break;
      case 3:
        break;
      case 4:
        break;
    }
  }
  
  public static void listar(String x[]) {
    
    for (int i = 0; i < x.length; i++) {
      System.out.println((i + 1) + ". " + x[i]);
    }
    
  }
  
  public static void crear(String x[], String campo, String dato) {
    
    x[x.length] = dato;
    
  }
}
