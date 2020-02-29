import java.util.*;

public class Validaciones{
	
	public static boolean validarCuadratura(MatrizInt m1, MatrizInt m2){
		if ((m1.getRenglones()== m2.getRenglones()) && (m1.getColumnas()== m2.getColumnas()))
			return true;
			else return false;
	
	}
	
	public static boolean validarMultiplicabilidad(MatrizInt m1, MatrizInt m2){
		if(m1.getColumnas()== m2.getRenglones())
			return true;
			else return false;
	
	
	}
	
	public static boolean validarCuadraturaF(MatrizFloat m3, MatrizFloat m4){
		if ((m3.getRenglones()== m4.getRenglones()) && (m3.getColumnas()== m4.getColumnas()))
			return true;
			else return false;
	
	}
	
	public static boolean validarMultiplicabilidadF(MatrizFloat m3, MatrizFloat m4){
		if(m3.getColumnas()== m4.getRenglones())
			return true;
			else return false;
	
	
	}
	
	public static boolean validarCuadraturaD(MatrizDouble m5, MatrizDouble m6){
		if ((m5.getRenglones()== m6.getRenglones()) && (m5.getColumnas()== m6.getColumnas()))
			return true;
			else return false;
	
	}
	
	public static boolean validarMultiplicabilidadD(MatrizDouble m5, MatrizDouble m6){
		if(m5.getColumnas()== m6.getRenglones())
			return true;
			else return false;
	
	
	}
	


}