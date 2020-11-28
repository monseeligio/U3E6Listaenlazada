package listasenlazadas;

import java.util.Scanner;

public class Procesos {
Nodo raiz=null;
Nodo cima= null;
Nodo anterior= null;
Nodo siguiente=null;
int tamanio=0, posicion, contador=1;
boolean repetir=true;

Scanner leer = new Scanner (System.in);
//insertar al final
public void InsertarFinal(Object inserta){
    Nodo nodoactual=new Nodo(inserta);
    if(raiz==null){
        raiz=nodoactual;
        cima=nodoactual;
    }
        else{
        cima.Siguiente=nodoactual;
        cima= nodoactual;                
        }
    tamanio++;
}

//inserat al inicio
public void InsertarInicio(Object inserta){
    Nodo nodoactual=new Nodo(inserta);
    if(raiz==null){
        raiz=nodoactual;
        cima=nodoactual;
    }
        else{
        nodoactual.Siguiente=raiz;
        raiz= nodoactual;                
        }
    tamanio++;
}

public void InsertarPosicion(Object inserta){
  Nodo auxiliar=raiz;
  Nodo nodoactual=new Nodo(inserta);
   if(raiz==null){
        raiz=nodoactual;
        cima=nodoactual;
    }
     else{
     while(repetir){
         System.out.println("¿Cual es la posicion que desea insertar?");
         posicion=leer.nextInt();
         if(posicion>tamanio){
             System.out.println("Solo puedes insertat hasta la posicion: "+tamanio);
         }
         else
          repetir=false; 
     }
     
     if(posicion==1){
     nodoactual.Siguiente=raiz;
     raiz=nodoactual;
     }
     else{
         for(int i=1; i<=posicion; i++){
          if(i==posicion-1){
              anterior=auxiliar;
              siguiente=auxiliar.Siguiente;
          }
          else{
             auxiliar=auxiliar.Siguiente; 
          }
         } 
         cima=raiz;
         for(int i=1; i<=tamanio; i++){
             if(cima.elemento.equals(anterior.elemento)){
                 cima.Siguiente=nodoactual;
                 cima=nodoactual;
                 nodoactual.Siguiente=siguiente;
             }
             else{
                 cima=cima.Siguiente;
             }
         }
         }
     }
     tamanio++;
   }


public void EliminarInicio(){
    if(raiz==null){
        System.out.println("No existe ningun elemento a eliminar");
    }
    else{
        raiz=raiz.Siguiente;
        tamanio--;
        System.out.println("Dato eliminado");
    }
}
public void EliminarFinal(){
   if(raiz==null){
       System.out.println("No existen elementos a eliminar");
   }
   else{
       if(raiz==cima){
           raiz=cima=null;
       }
       else{
       Nodo auxiliar=raiz;
       while(auxiliar.Siguiente!=cima){
           auxiliar=auxiliar.Siguiente;
       }
       cima=auxiliar;
       cima.Siguiente=null;
   }
   }
    
}
        
public void EliminarPosicion(){
        boolean repetir2=true;

    if(raiz==null){
       System.out.println("No existen elementos a eliminar");
   }
   else{
    while(repetir2){
         System.out.println("¿Cual es la posicion que desea eliminar?");
         posicion=leer.nextInt();
         if(posicion>tamanio){
             System.out.println("Solo puedes insertat hasta la posicion: "+tamanio);
         }
         else{
          repetir2=false;
         }
     }
    
     if(posicion==1){
     raiz=raiz.Siguiente;
     }
     else{
       Nodo anterior, temporal;
       anterior=raiz;
       temporal=raiz.Siguiente;
       
        for(int i=1; i<=posicion; i++){
          if(i==posicion-1){
           if(temporal.Siguiente==cima){
            anterior.Siguiente=cima;   
           }
           else{
           anterior.Siguiente=temporal.Siguiente;
           }
          }
          else{
           anterior=anterior.Siguiente;
           temporal=temporal.Siguiente;
          }
   }
}
}
tamanio--;
}


public void mostrar(){
    Nodo auxiliar= raiz;
    if(auxiliar==null){
        System.out.println("No existe ningun elemento a mostrar");  
    }
    else{
        while(auxiliar!=null){
            System.out.print(" "+auxiliar.elemento);
            auxiliar=auxiliar.Siguiente;
        }
    }
}




}
