import java.util.*;

public class OperacionesMatricesFloat {
	
	public static MatrizFloat sumarMatFloat(MatrizFloat m3, MatrizFloat m4){
	 MatrizFloat matResult = new MatrizFloat(m3.getRenglones(), m4.getColumnas());
	 for(int i=0; i < matResult.array.length; i++){
		for(int j=0; j< matResult.array[i].length; j++){
			matResult.array[i][j] = m3.array[i][j] + m4.array[i][j];
		}
	 }
	 return matResult;
	
	}
	
	public static MatrizFloat restarMatFloat(MatrizFloat m3, MatrizFloat m4){
	 MatrizFloat matResult = new MatrizFloat(m4.getRenglones(), m4.getColumnas());
	 for(int i=0; i < matResult.array.length; i++){
		for(int j=0; j< matResult.array[i].length; j++){
			matResult.array[i][j] = m3.array[i][j] - m4.array[i][j];
		}
	 }
	 return matResult;
	
	}
	
	public static MatrizFloat multiplicacionFloat(MatrizFloat m3, MatrizFloat m4){
		MatrizFloat matResult = new MatrizFloat(m3.getRenglones(), m4.getColumnas());
		for(int i=0; i<m3.array.length; i++){
			for(int j=0; j<m4.array[0].length; j++){
				for(int k=0; k<m3.array[0].length; k++){
					matResult.array[i][j]+= m3.array[i][k] * m4.array[k][j];
				}
			}				
		}
		return matResult;
		
	}
	
	public static MatrizFloat transpuestaFloat(MatrizFloat m){
		MatrizFloat matTransp = new MatrizFloat(m.getColumnas(), m.getRenglones());
		for(int i=0; i<m.renglones; i++){
			for(int j=0; j<m.columnas; j++){
				matTransp.array[j][i] = m.array[i][j];
			}
		}
		return matTransp;
	}
	
}