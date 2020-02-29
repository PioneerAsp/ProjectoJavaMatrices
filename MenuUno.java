import java.util.*;
import java.util.Scanner;
	public class MenuUno{
		
		public static void MenuUno(){
		Scanner sc = new Scanner(System.in);
		int n;
		boolean salir = false;
			do{
				System.out.println("***Bienbenido al Generador de matrices");
				System.out.println("Tipo de matriz para generar/imprimir?");
				System.out.println("1- Enteros");
				System.out.println("2- Flotantes");
				System.out.println("3- Doubles");
				System.out.println("4- Salir");
				n = sc.nextInt();
			
				switch(n){
						case 1: System.out.println("*************");
								MatrizInt m1 = new MatrizInt(CapturaEntrada.capturaEntero("Numero de renglones de Matriz 1"), CapturaEntrada.capturaEntero("Numero de columnas de Matriz 1"));
								MatrizInt m2 = new MatrizInt(CapturaEntrada.capturaEntero("Numero de renglones de Matriz 2"), CapturaEntrada.capturaEntero("Numero de columnas de Matriz 2"));
								Genera.generaMuestraInt(m1);
								Genera.generaMuestraInt(m2);
								MenuDos.operInt(m1,m2);
								break;
						
						case 2: System.out.println("*************");
								MatrizFloat m3 = new MatrizFloat(CapturaEntrada.capturaEntero("Numero de renglones de Matriz 1"), CapturaEntrada.capturaEntero("Numero de columnas de Matriz 2"));
								MatrizFloat m4 = new MatrizFloat(CapturaEntrada.capturaEntero("Numero de renglones de Matriz 2"), CapturaEntrada.capturaEntero("Numero de columnas de Matriz 2"));		
								Genera.generaMuestraFloat(m3);
								Genera.generaMuestraFloat(m4);
								MenuDFloat.operFloat(m3,m4);
								break;
						
						case 3: System.out.println("*************");
								MatrizDouble m5 = new MatrizDouble(CapturaEntrada.capturaEntero("Numero de renglones de Matriz 1"), CapturaEntrada.capturaEntero("Numero de columnas de Matriz 2"));
								MatrizDouble m6 = new MatrizDouble(CapturaEntrada.capturaEntero("Numero de renglones de Matriz 2"), CapturaEntrada.capturaEntero("Numero de columnas de Matriz 2"));		
								Genera.generaMuestraDouble(m5);
								Genera.generaMuestraDouble(m6);
								MenuDDouble.operDouble(m5,m6);
								break;
						
						
						case 4: salir = true;
								break;
						
						default: System.out.println("Solo numeros entre el 1 al 4");
				
				}
				
			
			}while(!salir);
		}
	
	}