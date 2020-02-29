import java.util.*;
import java.util.Scanner;
	public class Menu{
		
		public static void menuUno(){
		Scanner sc = new Scanner(System.in);
		int n;
			do{
				System.out.println("***Bienbenido al Generador de matrices");
				System.out.println("Qué tipo de matriz quiere generar/imprimir?");
				System.out.println("1- Enteros");
				System.out.println("2- Flotantes");
				System.out.println("3- Doubles");
				System.out.println("4- Salir");
				n = sc.nextInt();
			
				switch(n){
				case 1: System.out.println("1");
						MatrizInt m1 = new MatrizInt(CapturaEntrada.capturaEntero("Numero de renglones de Matriz 1"), CapturaEntrada.capturaEntero("Numero de columnas de Matriz 2"));
						MatrizInt m2 = new MatrizInt(CapturaEntrada.capturaEntero("Numero de renglones de Matriz 2"), CapturaEntrada.capturaEntero("Numero de columnas de Matriz 2"));
						Genera.generaMuestraInt(m1);
						Genera.generaMuestraInt(m2);
						break;
						
				case 2: MatrizFloat m3 = new MatrizFloat(CapturaEntrada.capturaEntero("Numero de renglones de Matriz 1"), CapturaEntrada.capturaEntero("Numero de columnas de Matriz 2"));
						MatrizFloat m4 = new MatrizFloat(CapturaEntrada.capturaEntero("Numero de renglones de Matriz 2"), CapturaEntrada.capturaEntero("Numero de columnas de Matriz 2"));		
						Genera.generaMuestraFloat(m3);
						Genera.generaMuestraFloat(m4);
						break;
						
				case 3: MatrizDouble m5 = new MatrizDouble(CapturaEntrada.capturaEntero("Numero de renglones de Matriz 1"), CapturaEntrada.capturaEntero("Numero de columnas de Matriz 2"));
						MatrizDouble m6 = new MatrizDouble(CapturaEntrada.capturaEntero("Numero de renglones de Matriz 2"), CapturaEntrada.capturaEntero("Numero de columnas de Matriz 2"));		
						Genera.generaMuestraDouble(m5);
						Genera.generaMuestraDouble(m6);
						break;
						
						
				case 4: System.out.println("Menu de operaciones");
						menuDos();
						break;
				
				case 5: break;
				}
				
			
			}while(n!=5);
		}
		
		public static void menuDos(){
		Scanner sc = new Scanner(System.in);
		int n;
			do{
				System.out.println("***Bienbenido al Generador de matrices");
				System.out.println("Que Opracion quiere realizar");
				System.out.println("1- Suma");
				System.out.println("2- Resta");
				System.out.println("3- Doubles");
				System.out.println("4- Salir");
				n = sc.nextInt();
			
				switch(n){
				case 1: System.out.println("1");
						
						break;
						
				case 2: System.out.println("2");
						break;
						
				case 3: System.out.println("");
						break;
						
						
				case 4: System.out.println("Salida");
						break;
				}
				
			
			}while(n!=4);
		}
		
	
	}