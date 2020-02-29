import java.util.*;

public class OperacionesMatricesDouble {
	
	public static MatrizDouble sumarMatDouble(MatrizDouble m5, MatrizDouble m6){
	 MatrizDouble matResult = new MatrizDouble(m5.getRenglones(), m6.getColumnas());
	 for(int i=0; i < matResult.array.length; i++){
		for(int j=0; j< matResult.array[i].length; j++){
			matResult.array[i][j] = m5.array[i][j] + m6.array[i][j];
		}
	 }
	 return matResult;
	
	}
	
	public static MatrizDouble restarMatDouble(MatrizDouble m5, MatrizDouble m6){
	 MatrizDouble matResult = new MatrizDouble(m5.getRenglones(), m6.getColumnas());
	 for(int i=0; i < matResult.array.length; i++){
		for(int j=0; j< matResult.array[i].length; j++){
			matResult.array[i][j] = m5.array[i][j] - m6.array[i][j];
		}
	 }
	 return matResult;
	
	}
	
	public static MatrizDouble multiplicacionDouble(MatrizDouble m5, MatrizDouble m6){
		MatrizDouble matResult = new MatrizDouble(m5.getRenglones(), m6.getColumnas());
		for(int i=0; i<m5.array.length; i++){
			for(int j=0; j<m5.array[0].length; j++){
				for(int k=0; k<m5.array[0].length; k++){
					matResult.array[i][j]+= m5.array[i][k] * m6.array[k][j];
				}
			}				
		}
		return matResult;
		
	}
	
	public static MatrizDouble transpuestaDouble(MatrizDouble m){
		MatrizDouble matTransp = new MatrizDouble(m.getColumnas(), m.getRenglones());
		for(int i=0; i<m.renglones; i++){
			for(int j=0; j<m.columnas; j++){
				matTransp.array[j][i] = m.array[i][j];
			}
		}
		return matTransp;
	}
	
}