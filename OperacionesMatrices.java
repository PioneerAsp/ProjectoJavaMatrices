import java.util.*;

public class OperacionesMatrices{
	
	public static MatrizInt sumarMatInt(MatrizInt m1, MatrizInt m2){
	 MatrizInt matResult = new MatrizInt(m1.getRenglones(), m2.getColumnas());
	 for(int i=0; i < matResult.array.length; i++){
		for(int j=0; j< matResult.array[i].length; j++){
			matResult.array[i][j] = m1.array[i][j] + m2.array[i][j];
		}
	 }
	 return matResult;
	
	}
	
	public static MatrizInt restarMatInt(MatrizInt m1, MatrizInt m2){
	 MatrizInt matResult = new MatrizInt(m1.getRenglones(), m2.getColumnas());
	 for(int i=0; i < matResult.array.length; i++){
		for(int j=0; j< matResult.array[i].length; j++){
			matResult.array[i][j] = m1.array[i][j] - m2.array[i][j];
		}
	 }
	 return matResult;
	
	}
	
	public static MatrizInt multiplicacionInt(MatrizInt m1, MatrizInt m2){
		MatrizInt matResult = new MatrizInt(m1.getRenglones(), m2.getColumnas());
		for(int i=0; i<m1.array.length; i++){
			for(int j=0; j<m2.array[0].length; j++){
				for(int k=0; k<m1.array[0].length; k++){
					matResult.array[i][j]+= m1.array[i][k] * m2.array[k][j];
				}
			}				
		}
		return matResult;
		
	}
	
	public static MatrizInt transpuesta(MatrizInt m){
		MatrizInt matTransp = new MatrizInt(m.getColumnas(), m.getRenglones());
		for(int i=0; i<m.renglones; i++){
			for(int j=0; j<m.columnas; j++){
				matTransp.array[j][i] = m.array[i][j];
			}
		}
		return matTransp;
	}
	
}