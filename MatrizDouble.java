/*
López Valencia Luis Angel 1262057
grupo: 541  Programación Orientada a Objetos
*/

import java.util.*;
import java.util.Random;

public class MatrizDouble extends Matriz{ 				//SubClase hijo,  tipo de dato Entero. Heredó Métodos y atributos de la Clase Padre Matriz
    double array[][];
    
    public MatrizDouble(int renglones, int columnas) { 
        super(renglones, columnas);					//método constructor de Clase Matriz 
        array = new double[renglones][columnas];
    }
    
    public void iniciarMatrizDouble(){ 
     Random gen = new Random();
     for(int i = 0; i<this.renglones; i++)			//this.* se refiere a los atributos de la sublase MatrizInt.
         for(int j=0; j<this.columnas; j++)
             this.array[i][j]= (double)(gen.nextDouble());
    
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
    
}