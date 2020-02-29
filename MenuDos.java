import java.util.Scanner;
	public class MenuDos{
		
		public static void operInt(MatrizInt m1, MatrizInt m2){
		Scanner sc = new Scanner(System.in);
		int dI,opc1;
		boolean salir2I = false;
			do{
				System.out.println("********Menu N.2********");
				System.out.println("Escoga el tipo de operacion: ");
				System.out.println("1- Sumar");
				System.out.println("2- Restar");
				System.out.println("3- Multiplicar");
				System.out.println("4- Transpuesta");
				System.out.println("5- Inversa");
				System.out.println("6- Regresar");
				dI = sc.nextInt();
			
				switch(dI){
						case 1: System.out.println("*************");
								if(Validaciones.validarCuadratura(m1,m2)){
									MatrizInt p1 = new MatrizInt(m1.getRenglones(), m1.getColumnas());
									p1 = OperacionesMatrices.sumarMatInt(m1,m2);
									System.out.println("El resultado de la suma es: Matriz 3 = ");
									p1.imprimirMatriz();
								}
								else System.out.println("***Imposible, las dimenciones no son cuadraticas!***");
								break;
						
						case 2: System.out.println("*************");
								if(Validaciones.validarCuadratura(m1,m2)){
									MatrizInt p1 = new MatrizInt(m1.getRenglones(), m1.getColumnas());
									p1 = OperacionesMatrices.restarMatInt(m1,m2);
									System.out.println("El resultado de la resta es: Matriz 3 = ");
									p1.imprimirMatriz();
								}
								else System.out.println("***Imposible, las dimenciones no son cuadraticas!***");
								break;
						
						case 3: System.out.println("*************");								
								if(Validaciones.validarMultiplicabilidad(m1,m2)){
									MatrizInt p1 = new MatrizInt(m1.getRenglones(), m1.getColumnas());
									p1 = OperacionesMatrices.multiplicacionInt(m1,m2);
									System.out.println("El resultado de la multiplicacion es: Matriz 3 = ");
									p1.imprimirMatriz();
								}
								else System.out.println("***Imposible, las dimensiones (renglones y columnas) no son las mismas!***");
								break;
								
						case 4: System.out.println("*************");				
								MatrizInt p1 = new MatrizInt(m1.getRenglones(), m1.getColumnas());						
								System.out.println("Transponer Matriz 1 o Matriz 2");
								opc1=sc.nextInt();
								if(opc1==1)
									p1=OperacionesMatrices.transpuesta(m1);
								else p1=OperacionesMatrices.transpuesta(m2);
								System.out.println("Matriz Transpuesta: ");
								p1.imprimirMatriz();	
								break;
								
						case 5: System.out.println("*************");								
								
								break;
						
						case 6: salir2I = true;
								break;
						
						default: System.out.println("Solo numeros entre el 1 al 4");
				
				}
				
			
			}while(!salir2I);
		}
	}