/*
López Valencia Luis Angel 1262057
grupo: 541  Programación Orientada a Objetos
*/

import java.util.*;
import java.util.Random;

public class MatrizInt extends Matriz{ 				//SubClase hijo,  tipo de dato Entero. Heredó Métodos y atributos de la Clase Padre Matriz
    int array[][];
    
    public MatrizInt(int renglones, int columnas) { 
        super(renglones, columnas);					//método constructor de Clase Matriz 
        array = new int[renglones][columnas];
    }
    
    public void iniciarMatrizInt(){ 
     Random gen = new Random();
     for(int i = 0; i<this.renglones; i++)			//this.* se refiere a los atributos de la sublase MatrizInt.
         for(int j=0; j<this.columnas; j++)
             this.array[i][j]= (int)(gen.nextInt(10));
    
    }
	
	public void imprimirMatriz(){
        for(int i=0; i<this.renglones; i++){
            for(int j=0; j<this.columnas; j++)
            { 
                System.out.print(this.array[i][j] +"\t");    
            }
            System.out.println();
        }    
    }
    
} //Fin de la SubClase MatrizInt
