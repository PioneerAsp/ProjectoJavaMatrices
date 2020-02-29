/*
López Valencia Luis Angel 1262057
grupo: 541  Programación Orientada a Objetos
*/

import java.util.*;
public class Matriz {  //Clase Padre
    int columnas;
    int renglones;
    
    public Matriz(int renglones, int columnas){
        setRenglones(renglones);
        setColumnas(columnas);
    }
  //Encapsulamiento para validación de datos externos
    public void setRenglones(int renglones){  
     this.renglones = renglones; 
    
    }
    public void setColumnas(int columnas){
     this.columnas = columnas;
    
    }
    public int getRenglones(){
     return renglones;			//Puedes escribir this.renglones (para referirse a los atributos)
    }
    public int getColumnas(){
     return columnas;			//Puedes escribir this.columnas
    }
    
} //Fin de la Clase Matriz