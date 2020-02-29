import java.util.*;


public class MenuDFloat{

	public static void operFloat(MatrizFloat m3, MatrizFloat m4){
		Scanner sc = new Scanner(System.in);
		int dF,opc2;
		boolean salir2F = false;
			do{
				System.out.println("********Menu N.2********");
				System.out.println("Escoga el tipo de operacion: ");
				System.out.println("1- Sumar");
				System.out.println("2- Restar");
				System.out.println("3- Multiplicar");
				System.out.println("4- Transpuesta");
				System.out.println("5- Inversa");
				System.out.println("6- Regresar");
				dF = sc.nextInt();
			
				switch(dF){
						case 1: System.out.println("*************");
								if(Validaciones.validarCuadraturaF(m3,m4)){
									MatrizFloat p3 = new MatrizFloat(m3.getRenglones(), m3.getColumnas());
									p3 = OperacionesMatricesFloat.sumarMatFloat(m3,m4);
									System.out.println("El resultado de la suma es: Matriz 3 = ");
									p3.imprimirMatriz();
								}
								else System.out.println("***Imposible, las dimenciones no son cuadraticas!***");
								break;
						
						case 2: System.out.println("*************");
								if(Validaciones.validarCuadraturaF(m3,m4)){
									MatrizFloat p3 = new MatrizFloat(m3.getRenglones(), m3.getColumnas());
									p3 = OperacionesMatricesFloat.restarMatFloat(m3,m4);
									System.out.println("El resultado de la resta es: Matriz 3 = ");
									p3.imprimirMatriz();
								}
								else System.out.println("***Imposible, las dimenciones no son cuadraticas!***");
								break;
						
						case 3: System.out.println("*************");								
								if(Validaciones.validarMultiplicabilidadF(m3,m4)){
									MatrizFloat p3 = new MatrizFloat(m3.getRenglones(), m3.getColumnas());
									p3 = OperacionesMatricesFloat.multiplicacionFloat(m3,m4);
									System.out.println("El resultado de la multiplicacion es: Matriz 3 = ");
									p3.imprimirMatriz();
								}
								else System.out.println("***Imposible, las dimensiones (renglones y columnas) no son las mismas!***");
								break;
								
						case 4: System.out.println("*************");				
								MatrizFloat p3 = new MatrizFloat(m3.getRenglones(), m4.getColumnas());						
								System.out.println("Transponer Matriz 1 o Matriz 2");
								opc2=sc.nextInt();
								if(opc2==1)
									p3=OperacionesMatricesFloat.transpuestaFloat(m3);
								else p3=OperacionesMatricesFloat.transpuestaFloat(m4);
								System.out.println("Matriz Transpuesta: ");
								p3.imprimirMatriz();	
								break;
								
						case 5: System.out.println("*************");								
								
								break;
						
						case 6: salir2F = true;
								break;
						
						default: System.out.println("Solo numeros entre el 1 al 6");
				
				}
				
			
			}while(!salir2F);
		}





}