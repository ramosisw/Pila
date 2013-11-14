/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

import javax.swing.DefaultListModel;

/**
 *
 * @author Estefania
 */
public class Pila {

   
     private Pila.Elemento p = null;
   
    
    private class Elemento{
        
        private Object datos;
        
        private Pila.Elemento Siguiente; //Siguiente elemento
        
        
        
        private Elemento(){};
        
        private Elemento(Object d, Pila.Elemento s) 
               
        {
            //Se le asigna el dato
            datos = d;
            //Se le asigna el Enlace
            Siguiente = s;
        }
    }
    public Pila(){};//Constructo de la lista
    
    public int Tamano(){       // devuelve el numero de elementos de la lista
        Pila.Elemento q = p;  // primer elemento
        int n = 0;           

        while (q != null){
            n++;
            q = q.Siguiente;
        }
        return n;
    }
    /**
     * 
     * @param Obj 
     *   crear el elemento a añadir
         El elemento se va a llamar P que es una subclase de la clase
         Lista.Elemento, por lo que va a contener sus mismas propiedades
         Data que contiene los datos y siguiente
     */

    public void push(Object Obj){
      
        
        Pila.Elemento q = new Pila.Elemento(Obj, null);
            q.Siguiente = p;
            p = q;
        
    }
    
    public Object Obtener (int i){
        int nElementos = Tamano();
        
        if(i >= nElementos || i < 0)
            return null;
       Pila.Elemento q = p; //Obtenemos el primer elemento
        
        for(int n = 0; n < i; n++)
            q = q.Siguiente;
        return q.datos;
    }
        void pop(){
           p=p.Siguiente; 
       }
       
    
}
