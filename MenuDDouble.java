import java.util.*;


public class MenuDDouble{

	public static void operDouble(MatrizDouble m5, MatrizDouble m6){
		Scanner sc = new Scanner(System.in);
		int dD,opc3;
		boolean salir2D = false;
			do{
				System.out.println("********Menu N.2********");
				System.out.println("Escoga el tipo de operacion: ");
				System.out.println("1- Sumar");
				System.out.println("2- Restar");
				System.out.println("3- Multiplicar");
				System.out.println("4- Transpuesta");
				System.out.println("5- Inversa");
				System.out.println("6- Regresar");
				dD = sc.nextInt();
			
				switch(dD){
						case 1: System.out.println("*************");
								if(Validaciones.validarCuadraturaD(m5,m6)){
									MatrizDouble p3 = new MatrizDouble(m5.getRenglones(), m5.getColumnas());
									p3 = OperacionesMatricesDouble.sumarMatDouble(m5,m6);
									System.out.println("El resultado de la suma es: Matriz 3 = ");
									p3.imprimirMatriz();
								}
								else System.out.println("***Imposible, las dimenciones no son cuadraticas!***");
								break;
						
						case 2: System.out.println("*************");
								if(Validaciones.validarCuadraturaD(m5,m6)){
									MatrizDouble p3 = new MatrizDouble(m5.getRenglones(), m6.getColumnas());
									p3 = OperacionesMatricesDouble.restarMatDouble(m5,m6);
									System.out.println("El resultado de la resta es: Matriz 3 = ");
									p3.imprimirMatriz();
								}
								else System.out.println("***Imposible, las dimenciones no son cuadraticas!***");
								break;
						
						case 3: System.out.println("*************");								
								if(Validaciones.validarMultiplicabilidadD(m5,m6)){
									MatrizDouble p3 = new MatrizDouble(m5.getRenglones(), m5.getColumnas());
									p3 = OperacionesMatricesDouble.multiplicacionDouble(m5,m6);
									System.out.println("El resultado de la multiplicacion es: Matriz 3 = ");
									p3.imprimirMatriz();
								}
								else System.out.println("***Imposible, las dimensiones (renglones y columnas) no son las mismas!***");
								break;
								
						case 4: System.out.println("*************");				
								MatrizDouble p3 = new MatrizDouble(m5.getRenglones(), m6.getColumnas());						
								System.out.println("Transponer Matriz 1 o Matriz 2");
								opc3=sc.nextInt();
								if(opc3==1)
									p3=OperacionesMatricesDouble.transpuestaDouble(m5);
								else p3=OperacionesMatricesDouble.transpuestaDouble(m6);
								System.out.println("Matriz Transpuesta: ");
								p3.imprimirMatriz();	
								break;
								
						case 5: System.out.println("*************");								
								
								break;
						
						case 6: salir2D = true;
								break;
						
						default: System.out.println("Solo numeros entre el 1 al 6");
				
				}
				
			
			}while(!salir2D);
		}

}