/*
López Valencia Luis Angel 1262057
grupo: 541  Programación Orientada a Objetos
*/

import java.util.*;
import java.util.Random;


public class MatrizFloat extends Matriz{			//SubClase hijo, tipo de dato Flotante. Heredó Métodos y atributos de la Clase Padre Matriz
    float array[][];
    
    public MatrizFloat(int renglones, int columnas) { 
        super(renglones, columnas);						//método constructor de Clase Matriz
        array = new float[renglones][columnas];
    }
    
    public void iniciarMatrizFloat(){
     Random gen = new Random();
     for(int i = 0; i<this.renglones; i++)				//this.* se refiere a los atributos de la sublase MatrizInt.
         for(int j=0; j<this.columnas; j++)
             this.array[i][j]= (float)(gen.nextFloat());
    
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
    
} //Fin de la SubClase MatrizFlota