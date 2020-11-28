package listasenlazadas;

import java.util.Scanner;

public class ListasEnlazadas {
public static void main(String[] args) {
     Procesos lista =new Procesos();
     int opc;
      Scanner LECTOR = new Scanner(System.in);
     int elemento;
       do{ 
        System.out.println("\n-------Menu------");
        System.out.println("1. Insertar dato al inicio");
        System.out.println("2. Insertar dato al final");
        System.out.println("3. Insertar dato en posicion");
        System.out.println("4. Eliminar al inicio");
        System.out.println("5. Eliminar al final");
        System.out.println("6. Eliminar dato en posicion");
        System.out.println("7. Mostrar lista");
        System.out.println("8. Salir ");       
        System.out.println("¿Que desea realizar?");
        opc=LECTOR.nextInt();
        switch(opc){
            case 1:  
            System.out.println("inserte un elemento");
            elemento=LECTOR.nextInt();
            lista.InsertarInicio(elemento); 
            break;
            case 2:
            System.out.println("inserte un elemento");
            elemento=LECTOR.nextInt();
            lista.InsertarFinal(elemento);
            break;
            case 3:   
            System.out.println("inserte un elemento");
            elemento=LECTOR.nextInt();
            lista.InsertarPosicion(elemento);
            break;
            case 4:
            lista.EliminarInicio();
            break;
            case 5:
            lista.EliminarFinal();
            break;
            case 6:
            lista.EliminarPosicion();
            break;
            case 7:
            lista.mostrar();
            break;
            default:System.out.println("No existe esa opcion, por favor intente de nuevo");
        }
        
       }while(opc!=8);

        
        
    }
    
}
